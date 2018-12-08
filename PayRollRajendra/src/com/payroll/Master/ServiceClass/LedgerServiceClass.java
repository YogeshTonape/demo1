package com.payroll.Master.ServiceClass;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.payroll.Master.DaoInterface.LedgerDaoInterface;
import com.payroll.Master.Model.LedgerModel;
import com.payroll.Master.ServiceInterface.LedgerServiceInterface;

@Service
@Transactional
public class LedgerServiceClass implements LedgerServiceInterface
 {
	 @Autowired
	 LedgerDaoInterface ledgerdaointerface;
	 
    
	@Override
	public void saveLedgerMaster(LedgerModel ledgermodel) {
		// TODO Auto-generated method stub
		ledgerdaointerface.saveLedgerMaster(ledgermodel);
		
	}

	@Override
	public List<String> getLedgerList() {
		// TODO Auto-generated method stub
	return	ledgerdaointerface.getLedgerList();
	
	}
	

	
}
