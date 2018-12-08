package com.admin.service;

import java.util.List;
import com.admin.model.AdminModel;
import com.employee.model.EmployeeModel;
import com.payroll.Master.Model.ManagerModel;
import com.payroll.Master.Model.SuperVisorModel;


public interface AdminServiceInterface
 {
	public void updateAdmin(AdminModel admin);

	public AdminModel loginAdmin(String Username, String Password);
	public ManagerModel loginManager(String username,String password);
	
	public SuperVisorModel loginSupervisor(String username, String password);
	
	public EmployeeModel loginEmployee(String username, String password);
	public List<AdminModel> getAdminId(int adminId);
 }
