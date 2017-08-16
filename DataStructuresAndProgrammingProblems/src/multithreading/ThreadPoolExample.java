package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Worker implements Runnable{
	int id;
	
	public Worker(int id) {
		this.id = id;
	}
	@Override
	public void run() {
		System.out.println("Thread "+ id + " started");
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Thread "+ id + " Ended");
		
		
	}
	
}
public class ThreadPoolExample {
	public static void main(String[] args) throws InterruptedException {

		ExecutorService service = Executors.newFixedThreadPool(2) ;
		
		for(int i=0;i<10;i++){
			service.submit(new Worker(i));
		}
		System.out.println("All tasks submitted.");
		
		service.shutdown();
		service.awaitTermination(10, TimeUnit.HOURS);
		System.out.println("All tasks completed");
		
	}
	
	
	

}
