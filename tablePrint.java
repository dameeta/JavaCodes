package controlStatements;

import java.util.Scanner;

public class tablePrint {

	public static void main(String[] args) {
		
		
		System.out.println("Enter the number you want to print as a table");
Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		System.out.println("Enter the limit till you want to print a table");
		
		int limit =sc.nextInt();
for(int i=1;i<=limit;i++)
{
	
System.out.println(no + "*" + i + "=" + no*i);

}
	}

}
