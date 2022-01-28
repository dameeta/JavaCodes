package demo1;

public class Book {

	//identity
	int bid;
	String pu_name;
	String title;
	
	//state
	//depends on the behaviour we can define object state
	public void typeOfBook()
	{
		String type[]= {"fiction","mythological","autobigraphy"};
		System.out.println("the type of book is "+ type[1]);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//object of Book class
		Book b1=new Book();
		b1.bid=1901;
		b1.pu_name="Vasant Publication";
		b1.title="Technology book";
		System.out.println(b1.bid);
		System.out.println(b1.pu_name);
		System.out.println(b1.title);
		b1.typeOfBook();
		
		

	}

}
