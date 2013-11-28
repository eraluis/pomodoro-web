package msc.idm.commons;

import org.picketlink.annotations.PicketLink;
import org.picketlink.authentication.BaseAuthenticator;
import org.picketlink.credential.DefaultLoginCredentials;
import org.picketlink.idm.IdentityManager;
import org.picketlink.idm.model.User;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;

@PicketLink
public class SimpleAuthenticator extends BaseAuthenticator {

    @Inject DefaultLoginCredentials credentials;
    @Inject IdentityManager identityManager;
    
    @Override
    public void authenticate() {
        if ("eraluis".equals(credentials.getUserId()) &&
                "123567".equals(credentials.getPassword())) {
        
         User user = identityManager.getUser("eraluis");

         if( user != null ){
         setStatus(AuthenticationStatus.SUCCESS);
                setAgent( user );
         }else{
         setStatus(AuthenticationStatus.FAILURE);
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                        "Authentication Failure - User is not created."));
         }
            
        } else {
            setStatus(AuthenticationStatus.FAILURE);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(
                    "Authentication Failure - The username or password you provided were invalid."));
        }
    }
}

