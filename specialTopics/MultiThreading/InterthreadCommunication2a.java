package specialTopics.MultiThreading;

/* Thread
 * Correct implementation of producer and consumer using wait() and notify()
 * wait(), notify(), and notifyAll() can only be used within synchronized blocks
 */
class Q2a {
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

class Producer2a extends Thread {
	Q2a q;

	Producer2a(Q2a q) {
		this.q = q;
	}

	public void run() {
		int i = 0;

		while (true) {
			q.put(i++);
		}
	}
}

class Consumer2a extends Thread {
	Q2a q;

	Consumer2a(Q2a q) {
		this.q = q;
	}

	public void run() {
		while (true) {
			q.get();
		}
	}
}

class pc2a {
	public static void main(String[] args) {
		Q2a q = new Q2a();
		Producer2a p = new Producer2a(q);
		Consumer2a c = new Consumer2a(q);

		p.start();
		c.start();

		System.out.println("Press ctrl-C to stop.");
	}
}
