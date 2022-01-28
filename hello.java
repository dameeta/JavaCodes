package demo1;

import java.util.Scanner;

public class hello {
	
	public static void main()
	{
		System.out.println("main method");
	}
	public static void main(String  []args)
	{
		System.out.println("main");
		main();
		Scanner sc=new Scanner(System.in);
		double x=sc.nextInt();
		System.out.println(x+3.9);
		
	}

	/*
	 * public static void main(String[] args) { // TODO Auto-generated method stub
	 * 
	 * System.out.println("Hello Java");
	 * 
	 * 
	 * }
	 */

}
