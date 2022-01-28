package Constructor;

class Employee{
	int id=12;
	String name="Suma Joshi";
	public Employee()
	{
		
	System.out.println("Default constructor..." +id);	
	}
	public Employee(int id,String name)
	{
	this.id=id;	
	this.name=name;
	System.out.println("Second constructor..." +id);	
	}
	
	
	//constructor is a special method which doesnt have the return type
	//the name should be by classname
	//even if you dont specify the constructor the compiler will invoke its own default constructor
	//in a class we can overload constructor means constructors with different arguments
	//we are using constructors to initialize class variable 

@Override
public String toString() {
	return "["+"Employee is  "+" " +this.id +" "+ this.name + "]";
}
}
public class constructorDemo {



	public static void main(String[] args) {
		
Employee e1=new Employee();  
Employee e2=new Employee(1001,"Varun");
Employee e3=new Employee();//
System.out.println(e1);
System.out.println(e2);
		
	}

}
