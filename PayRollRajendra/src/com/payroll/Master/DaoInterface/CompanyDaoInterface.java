package com.payroll.Master.DaoInterface;

import java.util.List;

import com.payroll.Master.Model.CompanyModel;

public interface CompanyDaoInterface 
{
	void saveCompanyMaster(CompanyModel companymodel);
	
	List<String> getCompanyList();
	
    

 }
