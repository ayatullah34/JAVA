package com.hibernetdemo;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		SessionFactory factory =new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(City.class)
				.buildSessionFactory();
		
		//Unit of Work
		Session session = factory.getCurrentSession(); 
		
		try {
			session.beginTransaction();
			/*
			//HQL
			//select * from city
			//List<City> cities=session.createQuery("from City").getResultList();
			
			//select * from city where c.countryCode='TUR' OR  c.countryCode='USA' 
			//List<City> cities=session.createQuery("from City c where c.countryCode='TUR' OR  c.countryCode='USA' ").getResultList();
			
			//List<City> cities=session.createQuery("from City c order by c.name ").getResultList();
			
			for (City city:cities) {
				
				System.out.println(city.getName());
			}
			*/
			
			//----------------------GROUP BY �ZEL KULLANIMI ----------------------
			//countryCode bir string old. i�in list t�r�n� string ald�k
			
			/*
			 * List<String> countryCodes=session.
			 * createQuery("select c.countryCode from City c Group By c.countryCode").
			 * getResultList();
			 * 
			 * for (String countryCode:countryCodes) {
			 * 
			 * System.out.println(countryCode); }
			 */
			
			
			//-----------------INSERT ��LEM�----------------------
//			City city=new City();
//			city.setName("d�zce 10");
//			city.setCountryCode("TUR");
//			city.setDistrict("karadeniz");
//			city.setPopulation(10000);
//			session.save(city);
//			
			
			
			//----------------------UPDATE ��LEM� ----------------------
			/*
			 * City city =session.get(City.class,4086); //4086 TABLODA SE��LEN VER�N�N SIRA  NUMARASINA KAR�ILIK GEL�YOR
			 * city.setPopulation(110000); 
			 * session.save(city);
			 */
			
			
			//----------------------DELETE ��LEM�----------------------
			City city =session.get(City.class,4086);
			 session.delete(city); //4086 ID E SAH�P SEH�R S�L�ND�

			
			
			
			session.getTransaction().commit();
			//System.out.println("sehir eklendi"); INSERT
			//System.out.println("sehir g�ncellendi"); //UPDATE
			System.out.println("sehir silindi"); //DELETE
			
		}finally {
		
			factory.close();
		}
		

	}

}
