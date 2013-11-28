package msc.idm.bo;

import javax.ejb.Local;

import org.picketlink.idm.model.SimpleUser;

@Local
public interface IdentityManagerBO {
	
	public void addUser(SimpleUser user);

}
