package msc.pomodoro.web;


import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import msc.idm.bo.IdentityManagerBO;

import org.picketlink.idm.model.SimpleUser;

@RequestScoped @Named
public class AdminIdmController {
	
	@Inject IdentityManagerBO identityManagerBO;

	private SimpleUser user;

	public AdminIdmController(){
		user = new SimpleUser();
	}
	
	public void addUser(){
		identityManagerBO.addUser(user);;
	}
	
	//Getters and setters...
	public SimpleUser getUser() {
	return user;
	}
	
	public void setUser(SimpleUser user) {
	this.user = user;
	}

}
