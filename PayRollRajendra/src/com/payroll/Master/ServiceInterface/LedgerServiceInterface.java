package com.payroll.Master.ServiceInterface;

import java.util.List;

import com.payroll.Master.Model.LedgerModel;

public interface LedgerServiceInterface 
 {
   void saveLedgerMaster(LedgerModel ledgermodel);
   
   List<String> getLedgerList();

   }
