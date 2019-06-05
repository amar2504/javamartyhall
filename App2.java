package concurrentprog;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App2 {
	public App2() {
		ExecutorService taskList = Executors.newFixedThreadPool(100);
		taskList.execute(new Counter(6));
		taskList.execute(new Counter(7));
		taskList.execute(new Counter(8));
		taskList.shutdown();
	}
	
	private class Counter implements Runnable{
		// create an instance of main application in case we want
		// to call the methods of main class:
		private final int loopLimit;
		
		// create the constructor to get the mainapp reference so that we can call its
		// methods:
		public Counter (int l)
		{
			this.loopLimit = l;
		}
		
		 public void run()  {
			 
			 for (int i=0; i<loopLimit; i++)
			 {
		 		 String threadName = Thread.currentThread().getName();
				 System.out.printf("%s:%s%n", threadName, i);
				 pause(Math.random());
			 }
		 }

	}
	private void pause(double seconds) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(Math.round(1000.0 * seconds));
		} catch (InterruptedException ie) {}
	}
}
