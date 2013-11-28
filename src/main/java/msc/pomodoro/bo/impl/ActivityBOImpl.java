package msc.pomodoro.bo.impl;

import java.util.List;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import msc.pomodoro.bo.ActivityBO;
import msc.pomodoro.model.Activity;

@Stateless @WebService
public class ActivityBOImpl implements ActivityBO {

	@PersistenceContext(unitName = "pomodoro-pu")
	private EntityManager em;
	
	@Override
	public void addActivity(Activity activiy) {		
		System.out.println("Adding activity");
		em.persist(activiy);		
	}
	
	@Override
	@SuppressWarnings("unchecked")	
	public List<Activity> listActivities() {
		Query query = em.createNamedQuery(Activity.FIND_ALL);
		List<Activity> activities = query.getResultList();
		return activities;
	}
				
}
