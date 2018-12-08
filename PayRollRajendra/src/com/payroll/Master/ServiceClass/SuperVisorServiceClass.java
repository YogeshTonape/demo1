package com.payroll.Master.ServiceClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.payroll.Master.DaoInterface.SuperVisorDaoInterface;
import com.payroll.Master.Model.SuperVisorModel;
import com.payroll.Master.ServiceInterface.SuperVisorServiceInterface;

  @Service
  @Transactional

  public class SuperVisorServiceClass  implements SuperVisorServiceInterface
  {
	  @Autowired
	  SuperVisorDaoInterface supervisordaointerface;
	  
	
	  @Override
      public void saveSuperVisorMaster(SuperVisorModel supervisormodel) {
		// TODO Auto-generated method stub
		
		supervisordaointerface.saveSuperVisorMaster(supervisormodel);
		
	 }


	@Override
	public List<String> getSuperVisorList() {
		// TODO Auto-generated method stub
		return  supervisordaointerface.getSuperVisorList();
	}
	
 }