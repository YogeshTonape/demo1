package com.Enquiry.DaoInterface;

 import java.util.List;
 import com.Enquiry.model.EnquiryModel;

 public interface EnquiryDaoInterface 
   {
      public void saveEnquiryEmployee(EnquiryModel enquirymodel);
     
     List<String> getEnquiryList();
	 
  }
