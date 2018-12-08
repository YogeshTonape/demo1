package com.Enquiry.ServiceInterface;

import java.util.List;

import com.Enquiry.model.EnquiryModel;

public interface EnquiryServiceInterface
 {
      public void saveEnquiryEmployee(EnquiryModel enquirymodel);
     
       List<String> getEnquiryList();
	}
