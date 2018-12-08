                         
package com.payroll.Master.ControllerClass;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.payroll.Master.Model.LedgerModel;
import com.payroll.Master.ServiceInterface.LedgerServiceInterface;



 @Controller
public class LedgerController

{

   @Autowired
    private LedgerServiceInterface ledgerServiceInterface;
    
     @RequestMapping(value="ledgerInfo",method=RequestMethod.GET)
	 public  ModelAndView getCompanyMasterPage(Model model)
	  {
		System.out.println("Ledger Master Page");
	 
	
		                                                   
		List<String> LedgerList;
 		LedgerList=ledgerServiceInterface.getLedgerList();
 		model.addAttribute("LedgerList",LedgerList);
		return new ModelAndView("LedgerMasterPage");
		
	}
     
     
     /*************** save LedgerMaster ***************/
 	

 	@RequestMapping(value="saveLedger", method=RequestMethod.POST)
 	public ModelAndView saveCompanyMaster(Model model,@ModelAttribute("") LedgerModel ledgermodel )
 	{
 		System.out.println("### save Ledger Master...");
 	
 		ledgerServiceInterface.saveLedgerMaster(ledgermodel);

 		List<String> LedgerList;
 		LedgerList=ledgerServiceInterface.getLedgerList();
 		model.addAttribute("LedgerList",LedgerList);
 		return new ModelAndView("redirect:ledgerInfo.html");
 	}
    
  }





