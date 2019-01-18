package specialTopics.MultiThreading;

// Example of creating multiple threads - extends Thread

class NewThread2a extends Thread {
	Thread t;
	String name;
	
	NewThread2a(String name) {
		super(name);
		this.name = name;
		System.out.println("New thread: " + this);
	}

	public void run() {
		try {
			for (int n = 5; n > 0; n--) {
				System.out.println(name + " thread: " + n);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Exiting " + name);	
	}
}

class Thread2aDemo{
	public static void main(String[] args) {
		NewThread2a nt1 = new NewThread2a("One");      // create a new thread
		NewThread2a nt2 = new NewThread2a("Two");      // create a new thread
		NewThread2a nt3 = new NewThread2a("Three");      // create a new thread
		
		nt1.start();   // start the thread
		nt2.start();   // start the thread
		nt3.start();   // start the thread
		
		try {
			Thread.sleep(10000);        // main thread wait for other threads to end.  Should use join() instead
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted: " + e);
		}
		System.out.println("Exiting main thread.");	

	}
}
