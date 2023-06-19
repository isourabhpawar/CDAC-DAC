package dao;

import pojos.Department;
import org.hibernate.*;
import static utils.HibernateUtils.getFactory;

public class DepartmentDaoImpl implements DepartmentDao {

	@Override
	public String launchNewDept(Department dept) {
		String mesg = "Adding new dept failed!!!!!!!!!";
		// 1 get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			session.persist(dept);
		//	dept.getEmpList().forEach(e -> session.persist(e));
			tx.commit();
			mesg = "added new dept with auto generated id=" + dept.getId();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

}
