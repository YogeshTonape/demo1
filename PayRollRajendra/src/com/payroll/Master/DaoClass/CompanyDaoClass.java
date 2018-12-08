package com.payroll.Master.DaoClass;

 import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.payroll.Master.DaoInterface.CompanyDaoInterface;
 import com.payroll.Master.Model.CompanyModel;


  @Repository
  public class CompanyDaoClass implements CompanyDaoInterface
   {
     
	  @Autowired
	  SessionFactory sessionFactory;
	  
	 @Override
	 public void saveCompanyMaster(CompanyModel companymodel)
	  {
		// TODO Auto-generated method stub
		 System.out.println("In company Dao class");
		 
		 sessionFactory.getCurrentSession().save(companymodel);
	   }

	@Override
	public List<String> getCompanyList() {
		// TODO Auto-generated method stub
		
		SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery("SELECT c.companyId, c.companyName,c.location,c.city FROM CompanyModel c where c.companystatus='On'");
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return query.list();

		
	}
		
   }
	

  
