package specialTopics.MultiThreading;

public class CurrentThreadDemo {

	// main thread is created automatically when the program started
	public static void main(String[] args) {
		// t will contain the reference (the pointer) to the main thread (in this case
		// is the current thread)
		Thread t = Thread.currentThread();
		System.out.println("Main thread: " + t);

		// change the name of the thread
		t.setName("My Thread");
		System.out.println("Main thread: " + t);

		try {
			for (int n = 5; n > 0; n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted: " + e);
			// e.printStackTrace();
		}
	}
}
