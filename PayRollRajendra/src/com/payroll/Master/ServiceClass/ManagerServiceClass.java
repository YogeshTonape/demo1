package com.payroll.Master.ServiceClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.payroll.Master.DaoInterface.ManagerDaoInterface;
import com.payroll.Master.Model.ManagerModel;
import com.payroll.Master.ServiceInterface.ManagerServiceInterface;

 @Service
 @Transactional
  public class ManagerServiceClass implements ManagerServiceInterface
   {
      @Autowired
      ManagerDaoInterface managerdaointerface;
	 
	@Override
	public void saveManagerMaster(ManagerModel managermodel) {
		// TODO Auto-generated method stub
		managerdaointerface.saveManagerMaster(managermodel);
		
	}

	@Override
	public List<String> getManagerList() {
		// TODO Auto-generated method stub
		return managerdaointerface.getManagerList();
	}
	

}
