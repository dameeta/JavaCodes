package ThreadPack;

public class ThreadPrio extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadPrio th1=new ThreadPrio();
Thread t=new Thread(th1);
t.setName("main thread");
th1.setName("ThreadPrioThread");
t.setPriority(3);
th1.setPriority(5);
t.start();
th1.start();
	}

}
