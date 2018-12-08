package com.payroll.Master.DaoInterface;

import java.util.List;

import com.payroll.Master.Model.ManagerModel;

    public interface ManagerDaoInterface 
     {
     void saveManagerMaster(ManagerModel managermodel);
	
	 List<String> getManagerList();

}
