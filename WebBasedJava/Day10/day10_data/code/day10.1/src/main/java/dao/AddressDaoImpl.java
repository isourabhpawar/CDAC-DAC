package dao;

import static utils.HibernateUtils.getFactory;

import org.hibernate.Session;
import org.hibernate.Transaction;

import pojos.Address;
import pojos.Employee;

public class AddressDaoImpl implements AddressDao {

	@Override
	public String assignAddressToEmp(Address adr, long empId) {
		String mesg = "Assigning adr failed!";
		// 1 get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			// get persistent emp ref
			Employee emp = session.get(Employee.class, empId);
			if (emp != null) {
				// emp : PERSISTENT
				// establish uni dir link Adr ---> Emp
				adr.setOwner(emp);
				session.persist(adr);
			}
			tx.commit();
			mesg = "Address assigned to Emp !";
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}
		return mesg;
	}

	@Override
	public Address getAddressDetails(long empId) {
		Address adr = null;
		// 1 get session from SF
		Session session = getFactory().getCurrentSession();
		// 2. begin a tx
		Transaction tx = session.beginTransaction();
		try {
			adr = session.get(Address.class, empId);// adr id is same as emp id : thanks to @MapsId => shared PK
													// approach
			tx.commit();
		} catch (RuntimeException e) {
			if (tx != null)
				tx.rollback();
			throw e;
		}

		return adr;
	}

}
