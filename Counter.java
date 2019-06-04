package concurrentprog;

public class Counter implements Runnable{
	// create an instance of main application in case we want
	// to call the methods of main class:
	
	private final App1 mainapp;
	private final int loopLimit;
	
	// create the constructor to get the mainapp reference so that we can call its
	// methods:
	public Counter(App1 m, int l)
	{
		this.mainapp = m;
		this.loopLimit = l;
	}
	
	 public void run()  {
		 
		 for (int i=0; i<loopLimit; i++)
		 {
	 		 String threadName = Thread.currentThread().getName();
			 System.out.printf("%s:%s%n", threadName, i);
			 mainapp.pause(Math.random());
		 }
	 }

}
