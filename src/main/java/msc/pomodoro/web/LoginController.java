package msc.pomodoro.web;

import java.io.Serializable;

import org.picketlink.Identity;
import org.picketlink.Identity.AuthenticationResult;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

@RequestScoped @Named
public class LoginController implements Serializable{

	private static final long serialVersionUID = 8477819531757432091L;
	
	@Inject
    Identity identity;

    public LoginController(){
     System.out.println("LoginAction()...");
    }
    
    public String login() {
    	System.out.println("login...");
        AuthenticationResult result = identity.login();
        if (AuthenticationResult.FAILED.equals(result)) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(
                            "Authentication was unsuccessful. Please check your username and password " +
                                    "before trying again."));
            return null;
        }
        
        return "pomodoro?faces-redirect=true";
    }
    
    public String logout() {
    	System.out.println("logout...");
        identity.logout();
        
        return "login";
    }
    

}

