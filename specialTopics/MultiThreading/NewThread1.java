package specialTopics.MultiThreading;

// NewThread1 creates a new thread by implementing the Runnable interface
class NewThread1 implements Runnable{
	Thread t;
	
	NewThread1() {
		// create a new second thread
		t = new Thread(this, "Demo Thread");   // this = new thread to call run() in this object
		System.out.println("Child thread: " + t);
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

class Thread1Demo{
	public static void main(String[] args) {
		NewThread1 nt = new NewThread1();      // create a new thread
		
		nt.t.start();   // start the thread
		
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
