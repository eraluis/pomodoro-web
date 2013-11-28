package msc.idm.bo.impl;


import javax.ejb.Stateless;
import javax.inject.Inject;

import org.picketlink.idm.IdentityManager;
import org.picketlink.idm.model.Group;
import org.picketlink.idm.model.Role;
import org.picketlink.idm.model.SimpleGroup;
import org.picketlink.idm.model.SimpleRole;
import org.picketlink.idm.model.SimpleUser;

import msc.idm.bo.IdentityManagerBO;

@Stateless
public class IdentityManagerBOImp implements IdentityManagerBO{

	@Inject IdentityManager identityManager;
	
	@Override
	public void addUser(SimpleUser user){
		System.out.println("Adding new user...");
		System.out.println("User{loginName:"+ user.getLoginName()+" firstName:"+ user.getFirstName()+" lastName:"+ user.getLastName()+" email:"+ user.getEmail()+"}");
		System.out.println(user);

		identityManager.add(user);

		Group group = new SimpleGroup("employees");
		identityManager.add(group);

		Role admin = new SimpleRole("admin");
		identityManager.add(admin);
		System.out.println("New user added...");
		System.out.println(user);
	}

}
