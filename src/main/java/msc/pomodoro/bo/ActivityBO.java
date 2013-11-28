package msc.pomodoro.bo;

import java.util.List;

import javax.ejb.Local;

import msc.pomodoro.model.Activity;

@Local
public interface ActivityBO {
	
	public void addActivity(Activity activity);

	public List<Activity> listActivities();

}
