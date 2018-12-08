package com.Enquiry.model;
 import static javax.persistence.GenerationType.IDENTITY;
 import javax.persistence.Column;
 import javax.persistence.Entity;
 import javax.persistence.GeneratedValue;
 import javax.persistence.Id;
 import javax.persistence.Table;

    @Entity
    @Table(name="EnquiryModel", catalog="payroll_db")
    public class EnquiryModel
       {
	    @Id
		@GeneratedValue(strategy = IDENTITY)
	    @Column

	  
	    private int enq_Id;
	    private String enq_personName;
	    private String enq_personMob;
	    private String time;
	    private String date;
	    private String purpose;
	    private String enquiry_By;
        private String enquirystatus="On";
		
		public String getEnq_personName() {
			return enq_personName;
		}
		public int getEnq_Id() {
			return enq_Id;
		}
		public void setEnq_Id(int enq_Id) {
			this.enq_Id = enq_Id;
		}
		public void setEnq_personName(String enq_personName) {
			this.enq_personName = enq_personName;
		}
		public String getEnq_personMob() {
			return enq_personMob;
		}
		public void setEnq_personMob(String enq_personMob) {
			this.enq_personMob = enq_personMob;
		}
		public String getTime() {
			return time;
		}
		public void setTime(String time) {
			this.time = time;
		}
		public String getDate() {
			return date;
		}
		public void setDate(String date) {
			this.date = date;
		}
		public String getPurpose() {
			return purpose;
		}
		public void setPurpose(String purpose) {
			this.purpose = purpose;
		}
		public String getEnquiry_By() {
			return enquiry_By;
		}
		public void setEnquiry_By(String enquiry_By) {                                                                                   
			this.enquiry_By = enquiry_By;
		}
		public String getEnquirystatus() {
			return enquirystatus;
		}
		public void setEnquirystatus(String enquirystatus) {
			this.enquirystatus = enquirystatus;
		}
       }
	    
		