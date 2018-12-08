
package com.payroll.Master.ControllerClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

 import com.payroll.Master.Model.SuperVisorModel;
 import com.payroll.Master.ServiceInterface.SuperVisorServiceInterface;

 @Controller
 public class SuperVisorController 
  {
      @Autowired
      private SuperVisorServiceInterface supervisorserviceinterface;
    
      @RequestMapping(value="superVisorInfo",method=RequestMethod.GET)
	  public  ModelAndView getCompanyMasterPage(Model model)
	  {
		System.out.println("SuperVisor Master Page");
		
		 List<String> SuperVisorList;
		 SuperVisorList=supervisorserviceinterface.getSuperVisorList();
		 model.addAttribute("SuperVisorList",SuperVisorList);
		
		
		return new ModelAndView("SuperVisorMasterPage");
	
		
	}
 
     
 	@RequestMapping(value="saveSuperVisor", params="Save")
 	public ModelAndView saveCompanyMaster(Model model,@ModelAttribute("")SuperVisorModel supervisormodel )

 	   {
 		 System.out.println("save SuperVisor Master...");
 		 supervisorserviceinterface.saveSuperVisorMaster(supervisormodel);

 		 List<String> SuperVisorList;
 		 SuperVisorList=supervisorserviceinterface.getSuperVisorList();
 		 model.addAttribute("SuperVisorList",SuperVisorList);
 		
 	
 	  return new ModelAndView("redirect:superVisorInfo.html");
 	}
    
     
     

}