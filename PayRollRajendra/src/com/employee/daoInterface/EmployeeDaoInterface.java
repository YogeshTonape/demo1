package com.employee.daoInterface;

import java.util.Date;

import java.util.List;


import com.employee.model.EmployeeModel;

public interface EmployeeDaoInterface 
{
   
	List<String> getEmployeeList();
	
	void saveEmployee(EmployeeModel employeemodel);
	
	public void updateEmployeeDetails(int emp_Id,String empName,String contactNo,String address,String emailId,String Photocopy,String  AdharCardNo, String PanCardNo,String birthDate,String city,String state,String qualification,String userType,String Role);
	
	
	
	
	
	


}
