package msc.configuration;

import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.picketlink.annotations.PicketLink;

public class DatasorucesProducer {
	
	@Produces
	@PicketLink
	@PersistenceContext(unitName = "picketlink-pu")
	private EntityManager picketLinkEntityManager;
	
	
}
