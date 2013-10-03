package learn.hibernate.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

import learn.hibernate.beans.Event;
import learn.hibernate.util.HibernateUtil;

import org.hibernate.Session;

public class EventManager {
	public static void main(String[] args) throws IOException {
		EventManager eventManager = new EventManager();
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter title: ");
		String title = reader.readLine();
		
		eventManager.createAndStoreEvent(title, new Date());
		
		
		HibernateUtil.getSessionFactory().close();
	}
	
	private void createAndStoreEvent(String title, Date theDate){
		//session represents a single-threaded unit of work
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Event event = new Event();
		event.setTitle(title);
		event.setDate(theDate);
		
		session.save(event);
		
		session.getTransaction().commit();
	}
}
