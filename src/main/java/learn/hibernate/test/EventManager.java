package learn.hibernate.test;

import java.util.Date;

import learn.hibernate.beans.Event;
import learn.hibernate.util.HibernateUtil;

import org.hibernate.Session;

public class EventManager {
	public static void main(String[] args) {
		EventManager eventManager = new EventManager();
		eventManager.createAndStoreEvent("First Entry", new Date());
		
		HibernateUtil.getSessionFactory().close();
	}
	
	private void createAndStoreEvent(String title, Date theDate){
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Event event = new Event();
		event.setTitle(title);
		event.setDate(theDate);
		
		session.save(event);
		
		session.getTransaction().commit();
	}
}
