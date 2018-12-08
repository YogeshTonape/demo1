package com.payroll.Master.ServiceInterface;

import java.util.List;


import com.payroll.Master.Model.CompanyModel;

public interface CompanyServiceInterface
  {
	
   void saveCompanyMaster(CompanyModel companymodel);

   List<String> getCompanyList();

     

}
