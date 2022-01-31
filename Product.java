package com.demo.pack1;

public class Product {

	int prid;
	String prname;
	double price;
	int qty;
	public Product()
	{
		System.out.println("default constructor...");
	}
	public Product(int id,String name,int qty,double pr)
	{
		this.prid=id;
		this.prname=name;
		this.qty=qty;
		this.price=price;
		
	}
	
	@Override
	public String toString() {
		return "Product [qty=" + qty + ", prname=" + prname + ", price=" + price + ", prid=" + prid + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Product p1=new Product();
		p1.prid=1901;
		p1.prname="Dove soap";
		p1.qty=3;
		p1.price=154;
		System.out.println(p1);
		Product p2=new Product(1201,"Toothbrush",3,63.50);
		System.out.println(p2);
		atmCard aatm=new atmCard();
		aatm.myCardName="Manisha Shah";
		aatm.atmPinno=989;
	}

}
