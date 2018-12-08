package com.payroll.Master.DaoClass;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.payroll.Master.DaoInterface.ManagerDaoInterface;
import com.payroll.Master.Model.ManagerModel;

 @Repository
public class ManagerDaoClass implements ManagerDaoInterface
 {
    @Autowired
    SessionFactory sessionFactory;
	  
	@Override
	public void saveManagerMaster(ManagerModel managermodel) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(managermodel);
		
	}

	@Override
	public List<String> getManagerList() {
		// TODO Auto-generated method stub
		SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM ManagerModel");
		query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
		return query.list();

	}
	

}
