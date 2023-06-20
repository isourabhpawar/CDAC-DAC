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
			// dept.getEmpList().forEach(e -> session.persist(e));
			tx.commit();// hib performs auto dirty chking --> session.flush --> saves dept rec , chks
						// cascading --> ALL : include cascade : save --> propagates insert to child
						// entities --inserts emp recs , thanks to addEmp method --assigns FK to dept id
						// --session.close
			mesg = "added new dept with auto generated id=" + dept.getId();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public String deleteDeptDetails(String deptName) {
		String mesg = "Deleting dept failed!!!!!!!!!";
		String jpql = "select d from Department d where d.departmentName=:nm";
		// 1 get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			Department dept = session.createQuery(jpql, Department.class).setParameter("nm", deptName)
					.getSingleResult();
			// dept : persistent
			session.delete(dept);// marks dept entity for removal , dept : REMOVED
			tx.commit();
			mesg = "Dept " + dept.getDepartmentName() + " deleted !";
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return mesg;
	}

	@Override
	public Department getDepartmentDetails(String name) {
		Department dept = null;
	    String deptJpql = "select d from Department d where d.departmentName=:nm";
		//String deptJpql = "select d from Department d left join fetch d.empList where d.departmentName=:nm";
		// 1 get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
//			dept = session.createQuery(deptJpql, Department.class)
//					.setParameter("nm", name)
//					.getSingleResult();
			Long let=(long) 2;
			dept=session.get(Department.class, let);
//			dept=session.get(Department.class, 2);
			//dept : persistent
			//simply acces the size of the emp list
	//		dept.getEmpList().size();//Hint
			System.out.println(dept+" in daodept");
			tx.commit();
			System.out.println(dept+" =========================================in daodept");

		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return dept;//dept : detached
	}

}
