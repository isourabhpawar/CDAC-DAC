package utils;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static SessionFactory factory;// singleton ,immutable ,
	// inherently thrd safe object created one / DB
	// Job : session provider
	static {
		System.out.println("in static init block");
		factory=new Configuration() //empty config
				.configure() //reads props n mappings from hibernate.cfg.xml
				.buildSessionFactory();//building SF
	}
	//getter
	public static SessionFactory getFactory() {
		return factory;
	}
	

}
