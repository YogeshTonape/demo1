package com.payroll.Master.DaoInterface;


import java.util.List;

import com.payroll.Master.Model.SuperVisorModel;

public interface SuperVisorDaoInterface 
 {
	void saveSuperVisorMaster(SuperVisorModel supervisormodel);

	List<String> getSuperVisorList();

 }
