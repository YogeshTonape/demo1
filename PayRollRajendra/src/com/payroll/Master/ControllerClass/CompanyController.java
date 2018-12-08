package com.payroll.Master.ControllerClass;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.payroll.Master.Model.CompanyModel;
import com.payroll.Master.ServiceInterface.CompanyServiceInterface;



  @Controller 
  public class CompanyController 
    {
	
    @Autowired
    private CompanyServiceInterface companyServiceInterface;
    
     @RequestMapping(value="companyInfo",method=RequestMethod.GET)
	 public  ModelAndView getCompanyMasterPage(Model model)
	  {
		System.out.println("Company Master Page");
	
		
		List<String> CompanyList;
 		CompanyList=companyServiceInterface.getCompanyList();
 		model.addAttribute("CompanyList",CompanyList);
		return new ModelAndView("CompanyMasterPage");
	}
     
     /*************** save CompanyMaster ***************/
 	 @RequestMapping(value="saveCompany", params="Save")
 	 public ModelAndView saveCompanyMaster(Model model,@ModelAttribute("")CompanyModel companyModel)
     	{
 		System.out.println("save Company Master...");
 	
 		companyServiceInterface.saveCompanyMaster(companyModel);

 		List<String> CompanyList;
 		CompanyList=companyServiceInterface.getCompanyList();
 		model.addAttribute("CompanyList",CompanyList);
 		return new ModelAndView("redirect:companyInfo.html");
 	}
    
  }
