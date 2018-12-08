package com.admin.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.admin.model.AdminModel;
import com.employee.model.EmployeeModel;
import com.payroll.Master.Model.ManagerModel;
import com.payroll.Master.Model.SuperVisorModel;


 
 @Controller
   public class AdminDaoImpl  implements AdminDaoInterface
    {
	@Autowired
	SessionFactory sessionFactory;

	protected Session currentSession()
	{
		return sessionFactory.openSession();
	}
	@Override
	public void updateAdmin(AdminModel admin) {
		// TODO Auto-generated method stub
	
		sessionFactory.getCurrentSession().update(admin);
	}
	/**admin login*/
	@Override
	public AdminModel loginAdmin(String Username, String Password) {
		// TODO Auto-generated method stub
		
		System.out.println("Inside loginAdmin ");
		Criteria criteria;
		AdminModel admin=new AdminModel();

		criteria = currentSession().createCriteria(AdminModel.class).add(Restrictions.eq("username", Username));
		criteria = currentSession().createCriteria(AdminModel.class).add(Restrictions.eq("password", Password));

		
	admin = (AdminModel) criteria.setMaxResults(1).uniqueResult();
		
		return admin;
	
		
		
	}

	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<AdminModel> getAdminId(int adminId) {
		// TODO Auto-generated method stub
		
		return currentSession().createCriteria(AdminModel.class).add(Restrictions.idEq(adminId)).list();
	}
	
	
	/**manager login*/
	@Override
	public ManagerModel loginManager(String username, String password) 
	{
		System.out.println("Inside loginManager");
		Criteria criteria;
		ManagerModel manager=new ManagerModel();

		criteria = currentSession().createCriteria(ManagerModel.class).add(Restrictions.eq("Manager_userName", username));
		criteria = currentSession().createCriteria(ManagerModel.class).add(Restrictions.eq("Manager_passWord",password));

		
		manager = (ManagerModel) criteria.setMaxResults(1).uniqueResult();
		
		return manager;
	}
	
	
	/**supervisor login*/
	@Override
	public SuperVisorModel loginSupervisor(String username, String password) {
		System.out.println("Inside loginSupervisor");
		Criteria criteria;
		SuperVisorModel supervisor=new SuperVisorModel();

		criteria = currentSession().createCriteria(SuperVisorModel.class).add(Restrictions.eq("superVisor_userName", username));
		criteria = currentSession().createCriteria(SuperVisorModel.class).add(Restrictions.eq("superVisor_passWord",password));

		
		supervisor = (SuperVisorModel) criteria.setMaxResults(1).uniqueResult();
		
		return supervisor;
	}
	
	
	/**employee login*/
	@Override
	public EmployeeModel loginEmployee(String username, String password) {
		System.out.println("Inside loginManager");
		Criteria criteria;
		EmployeeModel employee=new EmployeeModel();

		criteria = currentSession().createCriteria(EmployeeModel.class).add(Restrictions.eq("employee_username", username));
		criteria = currentSession().createCriteria(EmployeeModel.class).add(Restrictions.eq("employee_password",password));

		
	employee = (EmployeeModel) criteria.setMaxResults(1).uniqueResult();
		
		return employee;
	}

}
