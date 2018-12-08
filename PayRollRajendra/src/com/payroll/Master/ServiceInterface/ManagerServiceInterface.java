package com.payroll.Master.ServiceInterface;

import java.util.List;

import com.payroll.Master.Model.ManagerModel;

public interface ManagerServiceInterface
  {
	
	  void saveManagerMaster(ManagerModel managermodel);
		
	  List<String> getManagerList();


}
