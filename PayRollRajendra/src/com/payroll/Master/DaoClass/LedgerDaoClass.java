package com.payroll.Master.DaoClass;

import java.util.List;


import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;
import com.payroll.Master.DaoInterface.LedgerDaoInterface;
import com.payroll.Master.Model.LedgerModel;

 @Repository
 public class LedgerDaoClass implements LedgerDaoInterface
 {
   @Autowired
   SessionFactory sessionFactory;
   
	  
	@Override
	public void saveLedgerMaster(LedgerModel ledgermodel) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(ledgermodel);
		
	}

	@Override
	public List<String> getLedgerList() {
		// TODO Auto-generated method stub
		
		SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM LedgerModel ");
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return query.list();
	}

}
