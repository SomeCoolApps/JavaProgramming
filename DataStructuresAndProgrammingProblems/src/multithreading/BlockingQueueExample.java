package multithreading;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueExample {
	static BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
	public static void main(String[] args) {
	 Thread produce = new Thread(new Runnable() {
		
		@Override
		public void run() {
			for(int i=0;i<1000;i++)
				produce();
			
		}
	});
	 
	 Thread consume = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0;i<1000;i++)
					consume();
				
			}
		});
	 
	 produce.start();
	 consume.start();
		
	}
	
	static Random random = new Random();
	
	public static void produce(){
		try {
			Thread.sleep(200);
			queue.put(random.nextInt(100));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	static public int consume(){
		int i=0 ;
		try {
			
			Thread.sleep(100);
			if(random.nextInt()%2==0)
				i = queue.take();
			
			System.out.println("getting value "+i +"queue Size: "+queue.size());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return i;
	}
	


}
