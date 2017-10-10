package com.cg.bean;

public class AccountBean {

	private int accid;
	private String accType;
	private int with_amt;
	private int balance;
	private int transId;
	
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public int getWith_amt() {
		return with_amt;
	}
	public void setWith_amt(int with_amt) {
		this.with_amt = with_amt;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public AccountBean(int accid, String accType, int with_amt, int balance,
			int transId) {
		super();
		this.accid = accid;
		this.accType = accType;
		this.with_amt = with_amt;
		this.balance = balance;
		this.transId = transId;
	}
	public AccountBean() {
		
	}
	@Override
	public String toString() {
		return "AccountBean [accid=" + accid + ", accType=" + accType
				+ ", with_amt=" + with_amt + ", balance=" + balance
				+ ", transId=" + transId + "]";
	}
	public void setTransId() {
		
		
	}

	
	
	
	
}
