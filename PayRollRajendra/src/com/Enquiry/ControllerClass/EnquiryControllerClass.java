
package com.Enquiry.ControllerClass;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.Enquiry.ServiceInterface.EnquiryServiceInterface;
import com.Enquiry.model.EnquiryModel;


   @Controller 
   public class EnquiryControllerClass
    {
     @Autowired
     private EnquiryServiceInterface enquiryServiceInterface;
    
      @RequestMapping(value="addEnquiry",method=RequestMethod.GET)
	  public  ModelAndView getEmployeeEnquiry(Model model)
	   {
        System.out.println("In Enquiry Controller Page");
		List<String> EnquiryList;
 		EnquiryList=enquiryServiceInterface.getEnquiryList();
 		model.addAttribute("EnquiryList",EnquiryList);
		return new ModelAndView("EnquiryPage");
   }
     
     
     /*************** save Enquiry page ***************/
     
 	  @RequestMapping(value="saveEnquiry", params="Save")
 	  public ModelAndView saveEmployeeController(Model model,@ModelAttribute("") EnquiryModel enquirymodel )
     	{
 		System.out.println("save Enquiry Page...");
 		
 	
        enquiryServiceInterface.saveEnquiryEmployee(enquirymodel);

 		List<String> EnquiryList;
 		EnquiryList=enquiryServiceInterface.getEnquiryList();
 		model.addAttribute("EnquiryList",EnquiryList);
 		return new ModelAndView("redirect:addEnquiry.html");
 	}
    
  }
