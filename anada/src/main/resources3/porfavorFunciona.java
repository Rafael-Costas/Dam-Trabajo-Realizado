	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.hibernate.cfg.Configuration;
	import java.util.List;

public class porfavorFunciona {



	
	    public static void main(String[] args) {
	        // Configura la sesión de Hibernate
	        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employees.class)
	                .buildSessionFactory();
	        Session session = factory.openSession();
	        
	        try {
	            // Inicia la transacción
	            Transaction transaction = session.beginTransaction();
	            
	            // Realiza la consulta para obtener todos los empleados
	            List<Employees> empleados = session.createQuery("from Employees").getResultList();
	            
	            // Muestra los empleados
	            for (Employees empleado : empleados) {
	                System.out.println(empleado.getLastName() + ", " + empleado.getFirstName() + " - " + empleado.getTitle());
	            }
	            
	            // Commit de la transacción
	            transaction.commit();
	            
	            System.out.println("Consulta realizada con éxito!");
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Cierra la sesión de Hibernate
	            session.close();
	            factory.close();
	        }
	    }
	}
