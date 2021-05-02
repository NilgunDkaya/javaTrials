package com.hibernatedemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Main {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		// Unit of Work
		Session session = factory.getCurrentSession();
		
		try {
			session.beginTransaction();
			
			// CRUD - Create Read Update Delete
			// HQL -> Hibernate Query Language
			// Select * from city
			// from City c where c.countryCode='TUR' and c.district='Ankara'
			// from City c where c.name LIKE '%kar%'
			// from City c order by c.name asc
			// asc -> ascending 		desc -> descending
			/*
			 * List<String> countryCodes =
			 * session.createQuery("select c.countryCode from City c group by c.countryCode"
			 * ) .getResultList();
			 * 
			 * for(String countryCode : countryCodes) { System.out.println(countryCode); }
			 */
			
			// INSERT
//			City city = new City();
//			city.setName("Düzce 11");
//			city.setCountryCode("TUR");
//			city.setDistrict("Karadeniz");
//			city.setPopulation(150000);
//			session.save(city); 
			
			// UPDATE
//			City city = session.get(City.class, 4081);
//			city.setPopulation(200000);
//			session.save(city);
			
			// DELETE
			City city = session.get(City.class, 4081);
			session.delete(city);
			
			
			session.getTransaction().commit();
			System.out.println("Þehir silindi");
			
		} finally {
			factory.close();
		}
	
		

	}

}
