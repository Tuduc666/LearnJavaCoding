package specialTopics.MultiThreading;

// Callme2a - Example of synchronized

class Callme2a {
	synchronized void call(String msg) {  // synchronized will allow only one thread to execute this method at a time (on the same instant of an object)
		System.out.print(" [" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("] ");
	}
}

class Caller2a extends Thread {
	String msg;
	Callme2a target;

	public Caller2a(Callme2a targ, String s) {
		target = targ;
		msg = s;
	}

	public void run() {
		target.call(msg);
	}
}

class Synch2a {
	public static void main(String[] args) {
		Callme2a target = new Callme2a();     // creating the same instant of an object
		Caller2a ob1 = new Caller2a(target, "Hello");
		Caller2a ob2 = new Caller2a(target, "Synchronized");
		Caller2a ob3 = new Caller2a(target, "World");

		ob1.start();
		ob2.start();
		ob3.start();

		try {
			// wait for threads to end
			ob1.join();
			ob2.join();
			ob3.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}
