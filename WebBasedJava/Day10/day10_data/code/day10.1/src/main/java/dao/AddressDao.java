package dao;

import pojos.Address;

public interface AddressDao {
//assign adr to existing emp
	String assignAddressToEmp(Address adr, long empId);

	// get adr details of a specific emp
	Address getAddressDetails(long empId);
}
