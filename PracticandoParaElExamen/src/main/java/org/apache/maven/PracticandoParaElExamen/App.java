package org.apache.maven.PracticandoParaElExamen;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 

{
	public static void main(String[] args) 
		
		  {
		    	 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		         org.hibernate.Session session = sessionFactory.openSession();

		         session.getTransaction().begin();
		         persona per= new persona();
		         per.setId(10);
		         per.setName("Lord Paco");
		         
		         session.persist(per);
		         session.getTransaction().commit();
		         session.close();
		         sessionFactory.close();
		  }
	}