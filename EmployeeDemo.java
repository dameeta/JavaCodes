package heterogeneoursExample;

class Employee{
	int id;

	@Override
	public String toString() {
		return "Employee [id=" + id + "]";
	}
	
}
class Manager extends Employee{
	String dept="IT";

	@Override
	public String toString() {
		return "Manager [dept=" + dept + "]";
	}
}
class AccountStaff extends Employee{
	String name="Account";

	@Override
	public String toString() {
		return "AccountStaff [name=" + name + "]";
	}
}
class Engineer extends Employee{
	String type="Civil";

	@Override
	public String toString() {
		return "Engineer [type=" + type + "]";
	}
}

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee e1[]=new Employee[5];
e1[0] =new Manager();
e1[1] =new AccountStaff();
e1[2] =new Employee();
e1[3] =new Manager();
e1[4] =new Engineer();
for(int i=0;i<=4;i++)
{
	
System.out.println(e1[i]);
}
	}

}
