package com.Enquiry.ServiceClass;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.Enquiry.DaoInterface.EnquiryDaoInterface;
import com.Enquiry.ServiceInterface.EnquiryServiceInterface;
import com.Enquiry.model.EnquiryModel;

   @Service
   @Transactional
   public class EnquiryServiceClass  implements  EnquiryServiceInterface
       {
	   @Autowired
	   EnquiryDaoInterface enquirydaointerface;
	   
    @Override
	public void saveEnquiryEmployee(EnquiryModel enquirymodel) {
    	System.out.println("Enter the Service Class");
		// TODO Auto-generated method stub
		enquirydaointerface.saveEnquiryEmployee(enquirymodel);
		
	}

	@Override
	public List<String> getEnquiryList() {
		// TODO Auto-generated method stub
		return enquirydaointerface.getEnquiryList();
	}


	
	
 }
