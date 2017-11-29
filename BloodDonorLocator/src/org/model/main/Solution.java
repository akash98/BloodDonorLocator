package org.model.main;

	    import org.web.model.*;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.*;  
	    import org.hibernate.cfg.*;  
	      
	    public class Solution {  
	    public static void main(String[] args) { 
	    	SessionFactory sf = new Configuration().configure().buildSessionFactory();
	    	//Configuration cfg = new Configuration();
	    	//cfg.configure("hibernate.cfg.xml");
	    	//SessionFactory sf = cfg.buildSessionFactory();
	    	Session session = sf.openSession();  
	          
	        Transaction t=session.beginTransaction();  
	          
	        Signup c=new Signup();  
	       
	        c.setUsername("Pradeep");
		    c.setPassword("12345");
		    c.setMoblieno(253564178);
		    c.setEmail("iamraoufkhan@gmail.com"); 
	          
		 /*   Signup c1=new Signup();  
	        c1.setUsername("Chandu");
		    c1.setPassword("9999");
		    c1.setMoblieno(15856239);
		    c1.setEmail("iamkhan@gmail.com");  */
		    
		  
		    Donor d = new Donor();
		    d.setAadhardid("123445");
		    d.setAge("23");
		    d.setBloodgroup("Bps");
		    d.setDateofbrith("24/2/2020");
		    d.setDrinks(true);
		    d.setGender("male");
		    d.setMoblieno(1112222);
		    d.setUsername("Ramu");
		    d.setPassword("12345");
		    d.setWeight("233");
		    
		    Set<Address> dAddress = new HashSet<Address>();
		    Address dAddress1 = new Address();
		    dAddress1.setCity("cbe");
		    dAddress1.setCountry("India");
		    dAddress1.setState("tamilNadu");
		    dAddress1.setZip("607003");
		    
		    Address dAddress2 = new Address();
		    dAddress2.setCity("ssss");
		    dAddress2.setCountry("In0dia");
		    dAddress2.setState("tamilNa");
		    dAddress2.setZip("60700");
		    
		    dAddress.add(dAddress1);
		    dAddress.add(dAddress2);
		    d.setDonarAddress(dAddress);
		    
		    Hospital h = new Hospital();
		    Address dAddress3 = new Address();
		    dAddress3.setCity("ssoo");
		    dAddress3.setCountry("In0dia");
		    dAddress3.setState("tailNa");
		    dAddress3.setZip("6070");
		    h.setAddress(dAddress3);
		    h.setLocation("Chennai");
		    h.setMoblieno(10000000);
		    
		    
		    Bloodbank b = new Bloodbank();
		    Address dAddress4 = new Address();
		    dAddress4.setCity("ss");
		    dAddress4.setCountry("In0dia");
		    dAddress4.setState("tamilNa");
		    dAddress4.setZip("60700");
		    b.setAddress(dAddress4);
		    b.setLocation("Chennai");
		    b.setMoblieno(1111111);
		    
		    
		   
		    Notification n = new Notification();
		    
		    
	          
	        session.persist(c);  
	       // session.persist(c1);
	        session.persist(d);
	        session.persist(h);
	        session.persist(b);
	        session.save(n);
	     
	        
	        
	       
	        
	        
	          
	        t.commit();  
	        session.close();  
	        System.out.println("successfully saved");  
	    }

		public Users get(String userName) {
			// TODO Auto-generated method stub
			
			return null;
		}  
	    
	    }
