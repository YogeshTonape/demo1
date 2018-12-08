package com.payroll.Master.DaoInterface;

import java.util.List;

import com.payroll.Master.Model.LedgerModel;

public interface LedgerDaoInterface 
 {
   void saveLedgerMaster(LedgerModel ledgermodel);
   
   List<String> getLedgerList();
	 
	
	
}