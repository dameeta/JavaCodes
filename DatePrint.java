package homogenousExample;
class MyDate{
	int day;
	int month;
	int year;
	public MyDate(int d,int m,int y)
	{
	this.day=d;
	this.month=m;
	this.year=y;
		
	}
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
}
public class DatePrint {
 
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MyDate d1[]=new MyDate[5];
d1[0]=new MyDate(1,2,1990);
d1[1]=new MyDate(2,2,1991);
d1[2]=new MyDate(5,2,1992);
d1[3]=new MyDate(7,2,1993);
d1[4]=new MyDate(4,2,1994);

for(int i=0;i<=4;i++)
{
System.out.println(d1[i]);	
}




	}

}
