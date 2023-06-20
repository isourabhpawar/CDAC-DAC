package dao;

import pojos.Department;

public interface DepartmentDao {
//Launch a new department
	 String launchNewDept(Department dept);
//delete dept  details (chk if cascade on delete works !)
	 String deleteDeptDetails(String deptName);
	 //get dept details
	 Department getDepartmentDetails(String name);
	
}
