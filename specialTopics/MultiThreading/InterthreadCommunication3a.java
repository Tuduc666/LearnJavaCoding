package specialTopics.MultiThreading;

import java.util.Scanner;

/*
 * DOES NOT WORK!!!!  This version does not work because we're not acting on the same object!!!!!!!!!!
 * DOES NOT WORK!!!!  This version does not work because we're not acting on the same object!!!!!!!!!!
 * DOES NOT WORK!!!!  This version does not work because we're not acting on the same object!!!!!!!!!!
 * DOES NOT WORK!!!!  This version does not work because we're not acting on the same object!!!!!!!!!!
 * 
 * Correct implementation of producer and consumer using wait() and notify()
 * wait(), notify(), and notifyAll() can only be used within synchronized blocks
 * Thread t1 = new Thread() example
 */
class Produce extends Thread {
	public void run() {
		synchronized (this) {
			System.out.println("Producer thread running...");
			try {
				wait();  // waiting for notify() from Consume thread
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Producer resumed.");
		}
	}
}

class Consume extends Thread {
	public void run() {
		synchronized (this) {
			try {
				Thread.sleep(2000);
				Scanner sc = new Scanner(System.in);

				System.out.println("Consumer thread running...");
				System.out.println("Waiting for return key to press...");
				sc.nextLine();
				System.out.println("Return key pressed");
				notify();           // eventhough notify() releases the wait() lock in produce()
				Thread.sleep(7000); // produce() still have to wait() until consume() is finished first
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class MainRunner {
	public static void main(String[] args) {
		Produce p = new Produce();
		Consume c = new Consume();

		p.start();
		c.start();

		try {
			p.join();
			c.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
