package specialTopics.MultiThreading;

// NewThread1b creates a new thread by extending the Thread class
class NewThread1b extends Thread {
	public void run() {
		try {
			for (int n = 5; n >= 0; n--) {
				System.out.println("Child: " + n);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Child thread done.");
	}
}

class Thread1bDemo {
	public static void main(String[] args) throws InterruptedException {
		NewThread1b nt = new NewThread1b(); // create a new thread

		nt.start(); 

		for (int n = 5; n > 0; n--) {
			System.out.println("Main thread: " + n);
			Thread.sleep(1000);
		}

		nt.join();
		System.out.println("Exiting main thread.");
	}
}
