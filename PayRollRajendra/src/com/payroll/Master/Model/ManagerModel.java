                                package com.payroll.Master.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ManagerModel",catalog="payroll_db")

public class ManagerModel
 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	
	private int Manager_id;
	private String Manager_name;
	private String Manager_userName;
	private String Manager_passWord; 
	                                  
	private String managerstatus="on";

	public int getManager_id() {
		return Manager_id;
	}

	public void setManager_id(int manager_id) {
		Manager_id = manager_id;
	}

	public String getManager_name() {
		return Manager_name;
	}

	public void setManager_name(String manager_name) {
		Manager_name = manager_name;
	}

	public String getManager_userName() {
		return Manager_userName;
	}

	public void setManager_userName(String manager_userName) {
		Manager_userName = manager_userName;
	}

	public String getManager_passWord() {
		return Manager_passWord;
	}

	public void setManager_passWord(String manager_passWord) {
		Manager_passWord = manager_passWord;
	}

	public String getManagerstatus() {
		return managerstatus;
	}

	public void setManagerstatus(String managerstatus) {
		this.managerstatus = managerstatus;
	}
	
	
	
}
