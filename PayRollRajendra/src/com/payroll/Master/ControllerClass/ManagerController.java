package com.payroll.Master.ControllerClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.payroll.Master.Model.ManagerModel;
import com.payroll.Master.ServiceInterface.ManagerServiceInterface;

@Controller
 public class ManagerController
 {
	@Autowired
    private  ManagerServiceInterface managerServiceInterface;
    
     @RequestMapping(value="managerInfo",method=RequestMethod.GET)
	 public  ModelAndView getCompanyMasterPage(Model model)
	  {
		System.out.println("Manager Master Page");
	
		
		List<String> ManagerList;
 		ManagerList=managerServiceInterface.getManagerList();
 		model.addAttribute("ManagerList",ManagerList);
		return new ModelAndView("ManagerMasterPage");
	}
     
     /*************** save ManagerMaster ***************/
 	@RequestMapping(value="saveManager", params="Save")
 	public ModelAndView saveCompanyMaster(Model model,@ModelAttribute("")ManagerModel managerModel)
 	{
 		System.out.println("save Manager Master...");
 	
 		managerServiceInterface.saveManagerMaster(managerModel);

 		List<String> ManagerList;
 		ManagerList=managerServiceInterface.getManagerList();
 		model.addAttribute("CompanyList",ManagerList);
 		return new ModelAndView("redirect:managerInfo.html");
 	}
    
  }
