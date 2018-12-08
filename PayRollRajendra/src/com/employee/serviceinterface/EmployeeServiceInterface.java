package com.employee.serviceinterface;

import java.util.Date;

import java.util.List;


import com.employee.model.EmployeeModel;

public interface EmployeeServiceInterface 
{

	void saveEmployee(EmployeeModel employeemodel);
	
	List<String> getEmployeeList();
	
	public void updateEmployeeDetails(int emp_Id,String empName,String contactNo,String address,String emailId,String Photocopy,String AdharCardNo, String PanCardNo,String birthDate,String city,String state,String qualification,String userType,String Role);

}
