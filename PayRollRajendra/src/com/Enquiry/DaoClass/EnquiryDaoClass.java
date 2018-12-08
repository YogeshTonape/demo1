package com.Enquiry.DaoClass;

import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 import com.Enquiry.DaoInterface.EnquiryDaoInterface;
 import com.Enquiry.model.EnquiryModel;

   @Repository
   public class EnquiryDaoClass implements EnquiryDaoInterface
     {
      @Autowired
      SessionFactory sessionFactory;
	 
	 @Override
	 public void saveEnquiryEmployee(EnquiryModel enquirymodel) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(enquirymodel);
		
	}

	    @SuppressWarnings("unchecked")
    	@Override
	     public List<String> getEnquiryList() {
		System.out.println("Enter the Enquiry Dao Class");
		// TODO Auto-generated method stub

       /* SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery("SELECT * FROM EnquiryModel ");*/
       SQLQuery query=sessionFactory.getCurrentSession().createSQLQuery("SELECT e.enq_Id, e.enq_personName,e.enq_personMob,e.time,e.date,e.purpose,e.enquiry_By FROM EnquiryModel e where e.enquirystatus='On'");
       query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
	   return query.list();
	 }
	

 }
