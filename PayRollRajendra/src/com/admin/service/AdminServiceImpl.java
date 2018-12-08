package com.admin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.admin.dao.AdminDaoImpl;
import com.admin.dao.AdminDaoInterface;
import com.admin.model.AdminModel;
import com.employee.model.EmployeeModel;
import com.payroll.Master.Model.ManagerModel;
import com.payroll.Master.Model.SuperVisorModel;

 @Service("adminService")
 @Transactional(propagation=Propagation.SUPPORTS,rollbackFor=Exception.class)


public class AdminServiceImpl implements AdminServiceInterface
{
     @Autowired
     AdminDaoInterface admindaoInterface;
	 
	 
	@Override
	public void updateAdmin(AdminModel admin) {
		// TODO Auto-generated method stub
		 admindaoInterface.updateAdmin(admin);
		
	}

	@Override
	public AdminModel loginAdmin(String Username, String Password) {
		// TODO Auto-generated method stub
		System.out.println("inside login Adminserviceimpl");
		 return admindaoInterface.loginAdmin(Username, Password);
	}

	@Override
	public List<AdminModel> getAdminId(int adminId) {
		// TODO Auto-generated method stub
		return admindaoInterface.getAdminId(adminId);
	}

	@Override
	public ManagerModel loginManager(String username, String password) {
		
		return admindaoInterface.loginManager(username, password);
	}

	@Override
	public SuperVisorModel loginSupervisor(String username, String password) {
		// TODO Auto-generated method stub
		return admindaoInterface.loginSupervisor(username, password);
	}

	@Override
	public EmployeeModel loginEmployee(String username, String password) {
		// TODO Auto-generated method stub
		return admindaoInterface.loginEmployee(username, password);
	}
}
	
	
	
