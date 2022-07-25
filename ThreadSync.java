package ThreadPack;
class First
{
  public synchronized void display(String msg)
  {
    System.out.print ("["+msg);
    try
    {
      Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {
      e.printStackTrace();
    }
    System.out.println ("]");
  }
}

class Second extends Thread
{
  String msg;
  First f1;
  Second (First fp,String str)
  {
    f1 = fp;
    msg = str;
    start();
  }
  public void run()
  {
    f1.display(msg);
  }
}


public class ThreadSync {
	public static void main (String[] args)
	  {
	    First fst = new First();
	    Second ss = new Second(fst, "Welcome");
	    Second ss1= new Second(fst,"Java");
	    Second ss2 = new Second(fst, "World");
	  }
}
