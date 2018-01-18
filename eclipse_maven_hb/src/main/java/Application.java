import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import hb.config.HibernateUtil;
import hb.entity.Dog;
import hb.entity.Elephant;

public class Application
{
	public static void main(String[] args)
	{
		SessionFactory factory = HibernateUtil.getSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction transaction = session.beginTransaction();
		
		Elephant elephant = new Elephant();
		
		elephant.setName("elephant");
		elephant.setId("4");
		
		Dog dog = new Dog();
		dog.setName("Dog");
		dog.setId("2");
		
		session.save(dog);
		session.save(elephant);
		
		transaction.commit();
		session.close();
		HibernateUtil.shutdown();
		
	}
}
