package msc.pomodoro.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

import msc.pomodoro.bo.ActivityBO;
import msc.pomodoro.model.Activity;

@SessionScoped @Named
public class ActivityController implements Serializable {
	
	private static final long serialVersionUID = -5177260649407816144L;

    @Inject
    ActivityBO activityBO;    
    
	private List<Activity> activityList;
	private Activity newActivity;
	private Activity selectedActivity;
	
	public ActivityController(){

	}
	
	@PostConstruct
	public void init(){		
		activityList = activityBO.listActivities();
		newActivity = new Activity();
		selectedActivity = new Activity();
	}
	
	public void addActivity(){
		System.out.println("Activity action...");		
		activityBO.addActivity(newActivity);
		activityList.add(newActivity);
		init();
	}
	
	public void removeActivity(Activity p){
		activityList.remove(p);
	}

	//Getters and setters...
	public List<Activity> getActivityList() {
		return activityList;
	}

	public void setActivityList(List<Activity> activityList) {
		this.activityList = activityList;
	}

	public Activity getNewActivity() {
		return newActivity;
	}

	public void setNewActivity(Activity newActivity) {
		this.newActivity = newActivity;
	}

	public Activity getSelectedActivity() {
		return selectedActivity;
	}

	public void setSelectedActivity(Activity selectedActivity) {
		this.selectedActivity = selectedActivity;
	}
	
}
