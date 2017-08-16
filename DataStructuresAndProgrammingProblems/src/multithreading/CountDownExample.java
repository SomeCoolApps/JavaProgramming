package multithreading;

import java.util.concurrent.CountDownLatch;

class CountDownExample { 
	public static void main(String args[]) throws InterruptedException {
		CountDownLatch startSignal = new CountDownLatch(1);
		CountDownLatch doneSignal = new CountDownLatch(10);

		for (int i = 0; i < 10; ++i) // create and start threads
			new Thread(new InteractiveWorker(i, startSignal, doneSignal)).start();

		doSomethingElse(); // don't let run yet
		startSignal.countDown(); // let all threads proceed
		doSomethingElse();
		doneSignal.await(); // wait for all to finish
	}

	private static void doSomethingElse() {
		System.out.println(">");
		

	}
}

class InteractiveWorker implements Runnable {
	private final CountDownLatch startSignal;
	private final CountDownLatch doneSignal;
	private int id;

	InteractiveWorker(int id, CountDownLatch startSignal, CountDownLatch doneSignal) {
		this.id = id;
		this.startSignal = startSignal;
		this.doneSignal = doneSignal;
	}

	public void run() {
		try {
			startSignal.await();
			doWork();
			doneSignal.countDown();
		} catch (InterruptedException ex) {
		} // return;
	}

	void doWork() {
		try {
			Thread.sleep(1000*(id%2));
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("thread" + id + " work completed...");

	}
}
