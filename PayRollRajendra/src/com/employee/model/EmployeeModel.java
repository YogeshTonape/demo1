  package com.employee.model;
  import static javax.persistence.GenerationType.IDENTITY;

  import javax.persistence.Column;
  import javax.persistence.Entity;
  import javax.persistence.GeneratedValue;
  import javax.persistence.Id;
  import javax.persistence.JoinColumn;
  import javax.persistence.OneToOne;
  import javax.persistence.Table;

 import com.payroll.Master.Model.CompanyModel;
 import com.payroll.Master.Model.SuperVisorModel;

   @Entity
   @Table(name="EmployeeModel", catalog="payroll_db")
   public class EmployeeModel
    {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	/*@Column(name="emp_Id")*/
	@Column
    private int emp_Id ;
	private String empName;
	private String contactNo;
	private String address;
	private String emailId;
	private String Photocopy;
	
	public String getPhotocopy() {
		return Photocopy;
	}
	public void setPhotocopy(String photocopy) {
		Photocopy = photocopy;
	}
	/* private int superVisorid;
	 private int companyId;
*/
	private String  AdharCardNo;
	public String getAdharCardNo() {
		return AdharCardNo;
	}
	public void setAdharCardNo(String adharCardNo) {
		AdharCardNo = adharCardNo;
	}
	private String PanCardNo;
	/*private Byte[] Photocopy;*/
    private String birthDate;
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	private String city;
	private String state;
	private String qualification;
	private String userType;
	private String Role;
	private String employeestatus="On";
	
	

	
	@OneToOne
	@JoinColumn(name = "superVisorid")
	private SuperVisorModel supervisormodel;
	
	
	
	public SuperVisorModel getSupervisormodel() {
		return supervisormodel;
	}
	public void setSupervisormodel(SuperVisorModel supervisormodel) {
		this.supervisormodel = supervisormodel;
	}
	
	
	// for company model relation
	@OneToOne
	@JoinColumn(name="companyId")
    private CompanyModel companymodel;
	
	
	
    public CompanyModel getCompanymodel() {
		return companymodel;
	}
	public void setCompanymodel(CompanyModel companymodel) {
		this.companymodel = companymodel;
	}
	public String getEmployeestatus() {
		return employeestatus;
	}
	public void setEmployeestatus(String employeestatus) {
		this.employeestatus = employeestatus;
	}
	
	public int getEmp_Id() {
		return emp_Id;
	}
	public void setEmp_Id(int emp_Id) {
		this.emp_Id = emp_Id;
	}
	public String getEmpName() {
		return empName;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPanCardNo() {
		return PanCardNo;
	}
	public void setPanCardNo(String panCardNo) {
		PanCardNo = panCardNo;
	}
/*	public Byte[] getPhotocopy() {
		return Photocopy;
	}
	public void setPhotocopy(Byte[] photocopy) {
		Photocopy = photocopy;
	}*/
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) 
	{
		Role = role;
	}
 }
	 
	
