package com.payroll.Master.ServiceInterface;

import java.util.List;

import com.payroll.Master.Model.SuperVisorModel;

public interface SuperVisorServiceInterface 
{
    void saveSuperVisorMaster(SuperVisorModel supervisormodel);
    
    List<String> getSuperVisorList();
	
	
}
