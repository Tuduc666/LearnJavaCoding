package specialTopics.MultiThreading;

/*
 * Correct implementation of producer and consumer using wait() and notify()
 * wait(), notify(), and notifyAll() can only be used within synchronized blocks
 */
class Q2 {
	int n;
	boolean valueSet = false;

	synchronized int get() {
		// first time thru, valueSet=false, so the block will be executed
		while(!valueSet)
			try {
				// it will wait here until it gets a notify() from another synchronized block
				// that is processing the same object
				wait();
			} catch(InterruptedException e) {
				System.out.println("Interrupted Exception caught");
			}
		System.out.println("Got: " + n);
		// setting flag to false so that it would activate wait() in case it gets executed again before put() is executed
		valueSet = false;
		notify();  // this will release the wait() on the other synchronized block
		return n;
	}

	synchronized void put(int n) {
		// first time thru, valueSet=false, so the block will not be executed, there will be no wait()
		while(valueSet)
			try {
				wait();
			} catch(InterruptedException e) {
				System.out.println("Interrupted Exception caught");
			}

		this.n = n;
		// setting flag to true so that it would activate wait() in case it gets executed again before get() is executed
		valueSet = true;  
		System.out.println("Put: " + n);
		notify();   // this will release the wait() on the other synchronized block
	}
}

class Producer2 implements Runnable {
	Q2 q;
	Thread t;

	Producer2(Q2 q) {
		this.q = q;
		t = new Thread(this, "Producer");
	}

	public void run() {
		int i = 0;

		while (true) {
			q.put(i++);
		}
	}
}

class Consumer2 implements Runnable {
	Q2 q;
	Thread t;

	Consumer2(Q2 q) {
		this.q = q;
		t = new Thread(this, "Consumer");
	}

	public void run() {
		while (true) {
			q.get();
		}
	}
}

class pc2 {
	public static void main(String[] args) {
		Q2 q = new Q2();
		Producer2 p = new Producer2(q);
		Consumer2 c = new Consumer2(q);

		p.t.start();
		c.t.start();

		System.out.println("Press ctrl-C to stop.");
	}
}
