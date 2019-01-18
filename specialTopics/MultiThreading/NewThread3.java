package specialTopics.MultiThreading;

// Example of using join() and isAlive() - implements Runnable

class NewThread3 implements Runnable{
	Thread t;
	String name;
	
	NewThread3(String name) {
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

class Thread3Demo{
	public static void main(String[] args) {
		NewThread3 nt1 = new NewThread3("One");      // create a new thread
		NewThread3 nt2 = new NewThread3("Two");      // create a new thread
		NewThread3 nt3 = new NewThread3("Three");      // create a new thread
		
		// start the thread
		nt1.t.start();   
		nt2.t.start();  
		nt3.t.start();  
		
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
