package com.payroll.Master.DaoClass;

import java.util.List;


import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.payroll.Master.DaoInterface.SuperVisorDaoInterface;
import com.payroll.Master.Model.SuperVisorModel;

   @Repository
  public class SuperVisorDaoClass implements SuperVisorDaoInterface
  {
	   @Autowired
	   SessionFactory sessionFactory;
	   

	@Override
	public void saveSuperVisorMaster(SuperVisorModel supervisormodel)
	 {
		
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(supervisormodel);
		
	 }


	    @Override
	    public List<String> getSuperVisorList() {
		// TODO Auto-generated method stub
		
		SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM SuperVisorModel");
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return query.list();

	}
	
 }
