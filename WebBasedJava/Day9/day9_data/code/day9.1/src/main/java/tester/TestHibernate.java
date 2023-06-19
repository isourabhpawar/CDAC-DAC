package tester;

import org.hibernate.SessionFactory;
import static utils.HibernateUtils.getFactory;

public class TestHibernate {

	public static void main(String[] args) {
		try(SessionFactory sf=getFactory()) //invoking static method -->
		//cls loading --> static init block --> configure : entire hib frmwork loaded
		{
			System.out.println("hib up n running !!!! "+sf);
		} //sf.close() --> cleaning up DBCP (db conn pool)
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
