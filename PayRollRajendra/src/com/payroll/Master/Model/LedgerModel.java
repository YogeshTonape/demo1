                   package com.payroll.Master.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

  @Entity
  @Table(name="LedgerModel", catalog="payroll_db")
  public class LedgerModel 
    {
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 @Column
	 	
	private int ledgerId;
	private String ledgerName;
	private String Amount;
	private String Pf;
	
	private String ledgerstatus="on";
                                                       
	public int getLedgerId() {                          
		return ledgerId;
	}

	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}

	public String getLedgerName() {
		return ledgerName;
	}

	public void setLedgerName(String ledgerName) {
		this.ledgerName = ledgerName;
	}

	public String getAmount() {
		return Amount;
	}

	public void setAmount(String amount) {
		Amount = amount;
	}

	public String getPf() {
		return Pf;
	}

	public void setPf(String pf) {
		Pf = pf;
	}

	public String getLedgerstatus() {
		return ledgerstatus;
	}

	public void setLedgerstatus(String ledgerstatus) {
		this.ledgerstatus = ledgerstatus;
	}
 }
	
	
