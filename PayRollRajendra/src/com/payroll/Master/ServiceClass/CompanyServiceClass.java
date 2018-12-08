package com.payroll.Master.ServiceClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.payroll.Master.DaoInterface.CompanyDaoInterface;
import com.payroll.Master.Model.CompanyModel;
import com.payroll.Master.ServiceInterface.CompanyServiceInterface;

 
 @Service
 @Transactional
  
 public class CompanyServiceClass implements CompanyServiceInterface
 {
    
	 @Autowired
	 CompanyDaoInterface companydaointerface;
	 
	 
	@Override
	public void saveCompanyMaster(CompanyModel companymodel)
	 {
		System.out.println("Enter the company Master");
		// TODO Auto-generated method stub
		
	
		   companydaointerface.saveCompanyMaster(companymodel);
	  }
    
	  @Override
	  public List<String> getCompanyList() {
		// TODO Auto-generated method stub
	 return  companydaointerface.getCompanyList();
  }

		
 }
	

	
 
