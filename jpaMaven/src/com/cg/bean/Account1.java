package com.cg.bean;



import javax.persistence.Entity; 
import javax.persistence.GeneratedValue;
import javax.persistence.Id;



	@Entity
	public class Account1 {


		/*public LocalDateTime getDate() {
			return date;
		}
		public void setDate(LocalDateTime date) {
			this.date = date;*/
		//}
	public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
	public String getName() {
			return name;
		}


		public Account1() {
		super();
		// TODO Auto-generated constructor stub
	}
		public Account1(String name, String phoneNo, double balance, String emailId) {
		super();
		this.name = name;
		this.phoneNo = phoneNo;
		this.balance = balance;
		this.emailId = emailId;

	}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNo() {
			return phoneNo;
		}
		public void setPhoneNo(String phoneNo) {
			this.phoneNo = phoneNo;
		}
		
		
		@Id
		@GeneratedValue
		private int id;
		
	String name;
	 String phoneNo;
	 double balance;
	 String emailId;
	// LocalDateTime date;
	 
	}

