package demo1;

class AtmCard{
	
	int cardno;
	public int getPinno() {
		return pinno;
	}
	public void setPinno(int pinno) {
		this.pinno = pinno;
	}
	private int pinno;
	 void resetPinno(int pin)
	{
		System.out.println("After resetting pin no.. " + pin);
		
	}
}
//hiding the essential features of an object which is irrelevant to user is known as
//encapsulation
//private
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AtmCard atm=new AtmCard();
		atm.setPinno(4566);
		System.out.println(atm.getPinno());
		
		atm.resetPinno(1998);
		
	}

}
