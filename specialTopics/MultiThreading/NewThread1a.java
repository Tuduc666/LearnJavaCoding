package specialTopics.MultiThreading;

// NewThread1a creates a new thread by extending the Thread class
class NewThread1a extends Thread{
	
	// this constructor is actually not required
	NewThread1a() {
		// create a new second thread
		super("Demo Thread");   
		System.out.println("Child thread: " + this);
	}

	// this is the entry point for the second thread
	public void run() {
		try {
			for (int n = 5; n > 0; n--) {
				System.out.println("Child thread: " + n);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted: " + e);
		}
		System.out.println("Exiting child thread.");	
	}
}

class Thread1aDemo{
	public static void main(String[] args) {
		NewThread1a nt = new NewThread1a();      // create a new thread
		
		nt.start();   // start the thread
		
		try {
			for (int n = 5; n > 0; n--) {
				System.out.println("Main thread: " + n);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted: " + e);
		}
		System.out.println("Exiting main thread.");	
	}
}
