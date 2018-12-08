package com.payroll.Master.Model;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*import javax.persistence.OneToOne;*/
import javax.persistence.Table;

/*import com.employee.model.EmployeeModel;*/

   @Entity
   @Table(name="SuperVisorModel",catalog="payroll_db")

    public class SuperVisorModel 
    {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	
	
	private int superVisor_Id;
	private String superVisor_name;
	private String superVisor_userName;
	private String superVisor_passWord; 
    private String supervisorstatus="on";
	
    
/*   //for mapped  in EmployeeModel
    @OneToOne(mappedBy="SuperVisorModel")
	private EmployeeModel employeemodel;
    
	public EmployeeModel getEmployeemodel() {
		return employeemodel;
	}

	public void setEmployeemodel(EmployeeModel employeemodel) {
		this.employeemodel = employeemodel;
	}*/

	public int getSuperVisor_Id() {
		return superVisor_Id;
	}

	public void setSuperVisor_Id(int superVisor_Id) {
		this.superVisor_Id = superVisor_Id;
	}

	public String getSuperVisor_name() {
		return superVisor_name;
	}

	public void setSuperVisor_name(String superVisor_name) {
		this.superVisor_name = superVisor_name;
	}

	public String getSuperVisor_userName() {
		return superVisor_userName;
	}

	public void setSuperVisor_userName(String superVisor_userName) {
		this.superVisor_userName = superVisor_userName;
	}

	public String getSuperVisor_passWord() {
		return superVisor_passWord;
	}

	public void setSuperVisor_passWord(String superVisor_passWord) {
		this.superVisor_passWord = superVisor_passWord;
	}

	public String getSupervisorstatus() {
		return supervisorstatus;
	}

	public void setSupervisorstatus(String supervisorstatus) {
		this.supervisorstatus = supervisorstatus;
	}
    }
	