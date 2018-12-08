package com.employee.serviceclass;

import java.util.Date;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.employee.daoInterface.EmployeeDaoInterface;
import com.employee.model.EmployeeModel;
import com.employee.serviceinterface.EmployeeServiceInterface;

 @Service
 @Transactional
public class EmployeeServiceClass implements EmployeeServiceInterface
 {
   @Autowired
   EmployeeDaoInterface employeedaointerface;
   
   
	 
	@Override
	public void saveEmployee(EmployeeModel employeemodel) {
		// TODO Auto-generated method stub
		employeedaointerface.saveEmployee(employeemodel);
		
	}

	@Override
	public List<String> getEmployeeList() {
		// TODO Auto-generated method stub
		return employeedaointerface.getEmployeeList();
	}

@Override
	public void updateEmployeeDetails(int emp_Id, String empName, String contactNo, String address, String emailId,
			String Photocopy, String AdharCardNo, String PanCardNo, String birthDate, String city, String state,
			String qualification, String userType, String Role) {
		// TODO Auto-generated method stub
		employeedaointerface.updateEmployeeDetails(emp_Id, empName, contactNo, address, emailId, Photocopy, AdharCardNo, PanCardNo, birthDate, city, state, qualification, userType, Role);
	
		
	}
	

}
