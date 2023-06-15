package tester;

import static utils.HibernateUtils.getFactory;

import org.hibernate.SessionFactory;

public class TestHibernate {

	public static void main(String[] args) {
		try (SessionFactory sf = getFactory()) // static method ---> cls loading ---> static init block --> singleton
												// instance of SF
		{
			System.out.println("Hibernate is up n running !!!"+sf);//sf imple cls instance
		}  //sf.close() --> clean up DB connection pool!
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
