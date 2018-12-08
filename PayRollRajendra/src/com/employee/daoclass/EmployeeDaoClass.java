package com.employee.daoclass;

import java.util.Date;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.daoInterface.EmployeeDaoInterface;
import com.employee.model.EmployeeModel;

 @Repository
 public class EmployeeDaoClass implements EmployeeDaoInterface
 {
   
	 @Autowired
	 SessionFactory sessionFactory;
	 
	 
	 @Override
	 public void saveEmployee(EmployeeModel employeemodel) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(employeemodel);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getEmployeeList() {
		// TODO Auto-generated method stub
		 SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM EmployeeModel ");
		
		 /*SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery("SELECT e.emp_Id, e.empName,e.contactNo,e.address,e.emailId,e.AdharCardNo,e.PanCardNo,e.birthDate,e.city,e.state,e.qualification,e.userType,e.Role FROM EmployeeModel e where e.employeestatus='On'");*/
		 
		 query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);  
		 return query.list();
	}

	@Override
	public void updateEmployeeDetails(int emp_Id, String empName, String contactNo, String address, String emailId,
			String Photocopy, String AdharCardNo, String PanCardNo, String birthDate, String city, String state,
			String qualification, String userType, String Role) {
		// TODO Auto-generated method stub
		
		System.out.println("Inside Update Details "+emp_Id);
		SQLQuery query = sessionFactory.getCurrentSession().createSQLQuery("update EmployeeModel e set e.emp_Id='"+emp_Id+"',e.empName='"+empName+"',e.contactNo='"+contactNo+"',e.address='"+address+"',e.emailId='"+emailId+"', e.AdharCardNo='"+AdharCardNo+"', e.PanCardNo='"+PanCardNo+"', e.birthDate='"+birthDate+"', e.city='"+city+"', e.state='"+state+"', e.qualification='"+qualification+"', e.userType='"+userType+"', e.Role='"+Role+"'  where e.emp_Id='"+emp_Id+"'");
		System.out.println("query: " +query);
		query.executeUpdate();
		
    	}
  }
