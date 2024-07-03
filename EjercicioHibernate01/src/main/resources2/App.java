import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App {
	public static void main(String[] args) {
		
	
	 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
     Session session = sessionFactory.openSession();

     Transaction transaction = null;
     try {
         // Inicia una transacción
         transaction = session.beginTransaction();

         // Crea y configura una entidad Clientes
         Categories cliente = new Categories();
         cliente.setCategoryId(123454438);
         cliente.setCategoryName("JoseMota");
         cliente.setDescription("Señor de las motas");
         cliente.setCategoryId(null);
         
       

         // Guarda la entidad en la base de datos
        // session.save(cliente);
         
         session.persist(cliente);

         // Compromete la transacción
         transaction.commit();
     } catch (RuntimeException e) {
         if (transaction != null) transaction.rollback();
         e.printStackTrace();
     } finally {
         // Cierra la sesión
         session.close();
     }
 }
}