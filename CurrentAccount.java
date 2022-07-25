package com.pack.oops;


class SavingAccount{
	
	  private double balance;

	public double getBalance() {
		return balance;
	} 

	public void setBalance(double balance) {
		this.balance = balance;
	} 
}
public class CurrentAccount{
	
	protected double deposit;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 SavingAccount a1=new SavingAccount();

 
  a1.setBalance(5000);
 System.out.println(a1.getBalance());
 
 CurrentAccount c1=new CurrentAccount();
 c1.deposit=10000;
	System.out.println(c1.deposit);
	}

}

 
