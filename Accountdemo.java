package demo1;

class Account{
	
	

}
public class Accountdemo {
	int accid;
	String accname;
	double amt;
	double balance;
	
	public double deposit(double amt)
	{
		accid= 100089;
		accname= "Roger";
		System.out.println("The account id is " + accid);
		System.out.println("The account Name is " + accname);
		balance=0;
		balance=balance+amt;
		System.out.println("The account is deposited with\t"+ balance + "\tRupees");
		return balance;
	}
	
	public double withdraw(double amt)
	{
		
		balance = balance - amt;
		return balance;
	}


	public static void main(String [] args) {
		Accountdemo a1=new Accountdemo();
		a1.deposit(5000);
		System.out.println(a1.withdraw(500));
		

	}
	
}
