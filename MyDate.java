package ObjectPack;

public class MyDate {
private int day;
 private int month;
 private int year;

 public MyDate(int day, int month, int year) {
 this.day = day;
 this.month = month;
 this.year = year;
 }
 
 public boolean equals(Object o) {
	  boolean result = false;
	  if ( (o != null) && (o instanceof MyDate) ) {
	  MyDate d = (MyDate) o;
	  if ( (day == d.day) && (month == d.month)
	  && (year == d.year) ) {
	  result = true;
	  }
	  }
	  return result;
	  }
	 
	  public int hashCode() {
	  return (day ^ month ^ year);
	  }
	  
	  
	  @Override
	public String toString() {
		return "MyDate [day=" + day + "-"+", month=" + month + "-"+", year=" + year + "]";
	}

	public static void main(String [] args)
	  {
		  //==memory address and .equals()value check
		  
		  MyDate  date1=new MyDate(22,7,2021);
		  MyDate  date2=new MyDate(25,8,2021);
		 date1=date2;
			/*
			 * if(date1==date2) { System.out.println("identical"); } else {
			 * 
			 * System.out.println("not identical"); }
			 */
		  if(date1.equals(date2))
		  {
			  
			  System.out.println("equals");
		  }
		  else {
			  
			  System.out.println("not equal");
		  }
		  System.out.println(date1);
			  
	  }
	  }

