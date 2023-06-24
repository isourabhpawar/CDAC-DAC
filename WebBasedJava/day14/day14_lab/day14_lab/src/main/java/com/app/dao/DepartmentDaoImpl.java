//package com.app.dao;
//
//import java.util.List;
//import javax.persistence.*;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.app.pojos.Department;
//
//@Repository // mandatory annotation to tell SC : following is a
////spring bean containing data access logic
//public class DepartmentDaoImpl implements DepartmentDao {
//	// dependency : JPA's EntityManager
//	@Autowired // OR JPA annotation : @PersistenceContext =>mandatory dependency :
//				// required=true , Field level D.I
//	private EntityManager mgr;// auto supplied by spring supplied
////: LocalSessionFactoryBean : auto configured by spring boot !
//
//	@Override
//	public List<Department> getAllDepartments() {
//		// TODO Auto-generated method stub
//		return mgr
//				.createQuery("select d from Department d", Department.class)
//				.getResultList();
//	}
//
//}
