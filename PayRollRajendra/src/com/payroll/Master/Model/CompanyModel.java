package com.payroll.Master.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;*/
import javax.persistence.Table;
/*import com.employee.model.EmployeeModel;*/

 @Entity
 @Table(name="CompanyModel", catalog="payroll_db")
   
  public class CompanyModel
    {
	 
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 
	 @Column(name="companyId")
	 
	 private int  companyId;
	 private String companyName;
	 private String location;
	 private String city;
	 private String companystatus="On";

	/* //for mapped in EmployeeModel
	 @OneToOne(mappedBy="CompanyModel")
	 private EmployeeModel employeemodel;
	 
	 public EmployeeModel getEmployeemodel() {
		return employeemodel;
	}
	public void setEmployeemodel(EmployeeModel employeemodel) {
		this.employeemodel = employeemodel;
	}*/
	
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getCompanystatus() {
		return companystatus;
	}
	public void setCompanystatus(String companystatus) {
		this.companystatus = companystatus;
	}
  }
	