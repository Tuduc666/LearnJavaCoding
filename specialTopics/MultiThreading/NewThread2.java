package specialTopics.MultiThreading;

// Example of creating multiple threads - implements Runnable

class NewThread2 implements Runnable{
	Thread t;
	String name;
	
	NewThread2(String name) {
		this.name = name;
		// create a new second thread
		t = new Thread(this, name);   // this = new thread to call run() in this object
		System.out.println("New thread: " + t);
	}

	// this is the entry point for the second thread
	public void run() {
		try {
			for (int n = 5; n > 0; n--) {
				System.out.println(name + " thread: " + n);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted: " + e);
		}
		System.out.println("Exiting " + name);	
	}
}

class Thread2Demo{
	public static void main(String[] args) {
		NewThread2 nt1 = new NewThread2("One");      // create a new thread
		NewThread2 nt2 = new NewThread2("Two");      // create a new thread
		NewThread2 nt3 = new NewThread2("Three");      // create a new thread
		
		nt1.t.start();   // start the thread
		nt2.t.start();   // start the thread
		nt3.t.start();   // start the thread
		
		try {
			Thread.sleep(10000);        // wait for other threads to end
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted: " + e);
		}
		System.out.println("Exiting main thread.");	

	}
}
