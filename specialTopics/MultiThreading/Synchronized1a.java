package specialTopics.MultiThreading;

// Callme1a - Example of NOT synchronized - extends Thread

class Callme1a {
	void call(String msg) {
		System.out.print(" [" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Interrupted");
		}
		System.out.println("] ");
	}
}

class Caller1a extends Thread {
	String msg;
	Callme1a target;
	Thread t;

	public Caller1a(Callme1a targ, String s) {
		t = this;
		target = targ;
		msg = s;
	}

	public void run() {
		target.call(msg);
	}
}

class Synch1a {
	public static void main(String[] args) {
		Callme1a target = new Callme1a();
		Caller1a ob1 = new Caller1a(target, "Hello");
		Caller1a ob2 = new Caller1a(target, "Synchronized");
		Caller1a ob3 = new Caller1a(target, "World");

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
