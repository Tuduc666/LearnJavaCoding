package specialTopics.MultiThreading;

import java.util.Scanner;

/*
 * Correct implementation of producer and consumer using wait() and notify()
 * wait(), notify(), and notifyAll() can only be used within synchronized blocks
 * Thread t1 = new Thread() example
 */
class Processor {
	
	void produce() throws InterruptedException {
		synchronized(this) {
			System.out.println("Producer thread running...");
			wait();
			System.out.println("Producer resumed.");
		}
	}
	
	void consume() throws InterruptedException {
		Thread.sleep(2000);
		Scanner sc = new Scanner(System.in);
		synchronized(this) {
			System.out.println("Consumer thread running...");
			System.out.println("Waiting for return key to press...");
			sc.nextLine();
			System.out.println("Return key pressed");
			notify();            // eventhough notify() releases the wait() lock in produce()
			Thread.sleep(7000);   // produce() still have to wait() until consume() is finished first
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Processor p = new Processor();
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					p.produce();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				try {
					p.consume();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}	
		});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
	}
}
