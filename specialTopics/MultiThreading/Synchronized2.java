package specialTopics.MultiThreading;

// Callme2 - Example of synchronized

class Callme2 {
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

class Caller2 implements Runnable {
	String msg;
	Callme2 target;
	Thread t;

	public Caller2(Callme2 targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
	}

	public void run() {
		target.call(msg);
	}
}

class Synch2 {
	public static void main(String[] args) {
		Callme2 target = new Callme2();    // creating the same instant of an object
		Caller2 ob1 = new Caller2(target, "Hello");
		Caller2 ob2 = new Caller2(target, "Synchronized");
		Caller2 ob3 = new Caller2(target, "World");

		ob1.t.start();
		ob2.t.start();
		ob3.t.start();

		try {
			// wait for threads to end
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}
