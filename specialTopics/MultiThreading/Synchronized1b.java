package specialTopics.MultiThreading;

// Callme1b - Example of NOT synchronized - extends Thread

class Callme1b {
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

class Caller1b extends Thread {
	String msg;
	Callme1b target;

	public Caller1b(Callme1b targ, String s) {
		target = targ;
		msg = s;
	}

	public void run() {
		target.call(msg);
	}
}

class Synch1b {
	public static void main(String[] args) {
		Callme1b target = new Callme1b();
		Caller1b ob1 = new Caller1b(target, "Hello");
		Caller1b ob2 = new Caller1b(target, "Synchronized");
		Caller1b ob3 = new Caller1b(target, "World");

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
