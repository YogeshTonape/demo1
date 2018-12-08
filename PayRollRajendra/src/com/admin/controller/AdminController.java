package com.admin.controller;


 import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.velocity.app.event.implement.EscapeSqlReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.admin.dao.AdminDaoInterface;
import com.admin.model.AdminModel;
import com.admin.service.AdminServiceInterface;
import com.payroll.Master.Model.SuperVisorModel;
import com.employee.model.EmployeeModel;
import com.payroll.Master.Model.ManagerModel;

 @Controller
 
  public class AdminController
    {
	@Autowired
	AdminServiceInterface adminserviceinterface;
	@Autowired
	AdminDaoInterface adminDaoInterface;
	
    @RequestMapping("login")
	public ModelAndView loginPage()
	{	System.out.println("Login Controller");
		return new ModelAndView("LoginPage");
		
	}

	@RequestMapping(value = "adminLogin", method = RequestMethod.POST)
	public ModelAndView loginAdmin(@RequestParam("username") String username,
			@RequestParam("authority") String authority,@RequestParam("password") String password, Model model, HttpServletRequest httpServletRequest)throws Exception
		{

		System.out.println("Authority " + authority + "  USername = " + username + " Password = " + password);
        System.out.println("Inside login controller");
		HttpSession httpSession = httpServletRequest.getSession();
        AdminModel admin =new AdminModel();
        SuperVisorModel supervisor=new SuperVisorModel();
        ManagerModel manager=new ManagerModel();
        EmployeeModel employee=new EmployeeModel();
        
        if(authority.equals("admin"))
        {
        	
        	admin = adminserviceinterface.loginAdmin(username, password);
        	if(admin!=null)
        	{
        	if(admin.getUsername().equals(username)&&admin.getPassword().equals(password))
        	{
        		System.out.println("checked admin credintials");
        		return new ModelAndView("HomePage");
        	}
        	else 
        	{
        		model.addAttribute("errorMsg","wrong username or password");
        		return new ModelAndView("LoginPage");
        	}
        	}
        	model.addAttribute("errorMsg","wrong username or password");
        	return new ModelAndView("LoginPage");
        }
		/*if (admin != null) {
			
			System.out.println("admin.getUsername()"+admin.getUsername());
			System.out.println("admin.getPassword()"+admin.getPassword());
			
			if (admin.getUsername().equals(Username) && admin.getPassword().equals(Password)) {
				System.out.println("Login Successful");

				httpSession.setAttribute("adminSession", admin.getId());

				 model.addAttribute("errorMsg", "Login Success!");
				return new ModelAndView("HomePage");
			}

		}

		System.out.println("Invalid User");
		model.addAttribute("errorMsg", "Invalid User!");
*/
        else if (authority.equals("supervisor"))
        {
        	supervisor = adminserviceinterface.loginSupervisor(username, password);
        	if(supervisor!=null)
        	{
        		if(supervisor.getSuperVisor_userName().equals(username)&&supervisor.getSuperVisor_passWord().equals(password))
        		{
        			System.out.println("checked supervisor credintials");
        			return new ModelAndView("supervisorDashboard");        		}
        	}
        	model.addAttribute("errorMsg","wrong username or password");
        	return new ModelAndView("LoginPage");
		}
        else if (authority.equals("employee"))
        {
        	employee = adminserviceinterface.loginEmployee(username, password);
        	if(employee!=null)
        	{
        		/*if(employee.getEmployee_password().equals(password) && employee.getEmpName().equals(username))
        		{
        			System.out.println("checked employee credintials");
        			return new ModelAndView("employeeDashboard");
        		}*/
        	}
        	model.addAttribute("errorMsg","wrong username or password");
        
        	return new ModelAndView("LoginPage");
		}
        else if (authority.equals("site_manager"))
        {
        	manager = adminserviceinterface.loginManager(username, password);
        	return new ModelAndView("HomePage");
		}
        else
        {
        	System.out.println("login fail");
        }
        return new ModelAndView("LoginPage");
	}
}

	

/*@RequestMapping("home")
public ModelAndView homePage(Model model, HttpServletRequest req)
{	
	HttpSession httpSession = req.getSession();
	
	System.out.println("Home Controller");
	
	return new ModelAndView("HomePage");
	
	}
}
*/	

	
	