package concurrentprog;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App1 {
	public App1() {
		ExecutorService taskList = Executors.newFixedThreadPool(100);
		taskList.execute(new Counter(this,6));
		taskList.execute(new Counter(this,7));
		taskList.execute(new Counter(this,8));
		taskList.shutdown();
	}
	
	public void pause(double seconds) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(Math.round(1000.0 * seconds));
		} catch (InterruptedException ie) {}
	}
}
