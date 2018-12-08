
package com.employee.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.employee.model.EmployeeModel;
import com.employee.serviceinterface.EmployeeServiceInterface;


@Controller 
   public class EmployeeController
    {
     @Autowired
     private  EmployeeServiceInterface employeeServiceInterface;
    
      @RequestMapping(value="addEmployee",method=RequestMethod.GET)
	  public  ModelAndView getEmployeeEnquiry(Model model)
	   {
    	
    	System.out.println("In Employee Controller Page");
		List<String> EmployeeList;
 		EmployeeList=employeeServiceInterface.getEmployeeList();
 		model.addAttribute("EmployeeList",EmployeeList);
		return new ModelAndView("EmployeePage");
   }
     
     
     /*************** save Employee page ***************/
     
 	  @RequestMapping(value="saveEmployeeraj",params="Save")
 	  public ModelAndView saveEmployeeController(Model model,@ModelAttribute("") EmployeeModel employeemodel )
     	{
 		System.out.println("save Employee Page...");
 		
 	
 		employeeServiceInterface.saveEmployee(employeemodel);

 		List<String> EmployeeList;
 		EmployeeList=employeeServiceInterface.getEmployeeList();
 		model.addAttribute("EmployeeList",EmployeeList);
 		return new ModelAndView("redirect:addEmployee.html");
 	}
 	  
 	 
	@RequestMapping(value = "saveEmployeeraj", params = "Update")
 		public ModelAndView UpdateEmployee(Model model, HttpServletRequest request,
 			@ModelAttribute("") EmployeeModel employeemodel) {
 			System.out.println("Way to Update Company Employee Details");

 		
 		    int emp_Id = Integer.parseInt(request.getParameter("emp_Id1"));
 			System.out.println(emp_Id);
 			
 			String empName =  request.getParameter("empName");
 			System.out.println(empName);
 			
 			String contactNo = request.getParameter("contactNo");
 			System.out.println(contactNo);
 			
 			String address = request.getParameter("address");
 			System.out.println(address);
 			
 			String emailId = request.getParameter("emailId");
 			System.out.println(emailId);
 			
 		    String Photocopy = request.getParameter("Photocopy");
 		    System.out.println(Photocopy);
 		   
 		   String AdharCardNo = request.getParameter("AdharCardNo"); 
 		   System.out.println(AdharCardNo);
 		
 		   
 		   String PanCardNo  = request.getParameter("PanCardNo");
 		   System.out.println(PanCardNo);
 		  
 		   String birthDate  = request.getParameter("birthDate");
		   System.out.println(birthDate);
 		   
 		 /*  Date birthDate = Calendar.getInstance().getTime();  
           DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");  
 		   DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd ");
 		   String Date = dateFormat.format(birthDate);
 		  */
 		   
 		   String city = request.getParameter("city");
 		   System.out.println(city);
 		  
 	       String state = request.getParameter("state");
 		   System.out.println(state);
 		   
 		   String qualification = request.getParameter("qualification");
 		   System.out.println(qualification);
     		
 		   String userType = request.getParameter("userType");
 		   System.out.println(userType);
 		  
 		   String Role = request.getParameter("Role");
 		   System.out.println(Role);
 		  
 		  employeeServiceInterface.updateEmployeeDetails(emp_Id, empName, contactNo, address, emailId, Photocopy, AdharCardNo, PanCardNo,birthDate, city, state, qualification, userType, Role);
 			
 	      List<String> EmployeeList;
 	 	  EmployeeList=employeeServiceInterface.getEmployeeList();
 	      model.addAttribute("EmployeeList",EmployeeList);
 	 		
 			return new ModelAndView("redirect:addEmployee.html");

 		}
 	  
    }
