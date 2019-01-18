package specialTopics.MultiThreading;

// Example of using join() and isAlive() - extends Thread

class NewThread3a extends Thread{
	Thread t;
	String name;
	
	NewThread3a(String name) {
		super(name);
		this.name = name;
		t = this;   
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

class Thread3aDemo{
	public static void main(String[] args) {
		NewThread3a nt1 = new NewThread3a("One");      // create a new thread
		NewThread3a nt2 = new NewThread3a("Two");      // create a new thread
		NewThread3a nt3 = new NewThread3a("Three");      // create a new thread
		
		// start the thread
		nt1.start();   
		nt2.start();  
		nt3.start();  
		
		// thread is alive, print true or false
		System.out.println("Thread One is alive: " + nt1.t.isAlive());
		System.out.println("Thread Two is alive: " + nt2.t.isAlive());
		System.out.println("Thread Three is alive: " + nt3.t.isAlive());
		
		try {
			// Usually you want the main thread to finish last.  
			// You can accomplish this by using join() or isAlive().  Join() is more commonly used.
			System.out.println("Waiting for all threads to finish...");
			nt1.t.join();      
			nt2.t.join();      
			nt3.t.join();      
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted: " + e);
		}
		
		System.out.println("Thread One is alive: " + nt1.t.isAlive());
		System.out.println("Thread Two is alive: " + nt2.t.isAlive());
		System.out.println("Thread Three is alive: " + nt3.t.isAlive());
		
		System.out.println("Exiting main thread.");	

	}
}
