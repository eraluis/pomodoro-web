package msc.pomodoro.rs;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import msc.pomodoro.bo.ActivityBO;
import msc.pomodoro.model.Activity;

@Path("/activities")
@Produces({"application/xml", "application/json"})
public class ActivityResource {
	
	@Inject ActivityBO activityBO;
	
	@GET
	public List<Activity> listActivities() {		
		return activityBO.listActivities();
	}
	
}
