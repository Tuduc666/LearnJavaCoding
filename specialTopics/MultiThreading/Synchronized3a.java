package specialTopics.MultiThreading;

// Callme3a - Example of synchronized

class Callme3a {
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

class Caller3a extends Thread {
	String msg;
	Callme3a target;

	public Caller3a(Callme3a targ, String s) {
		target = targ;
		msg = s;
	}

	// synchronize calls to call()
	// synchronized will allow only one thread to execute this block at a time (on the same instant of an object)
	// target is the object in this case
	public void run() {
		// synchronized block
		synchronized(target) {  
			target.call(msg);
		}
	}
}

class Synch3a {
	public static void main(String[] args) {
		Callme3a target = new Callme3a();    // creating the same instant of an object
		Caller3a ob1 = new Caller3a(target, "Hello");
		Caller3a ob2 = new Caller3a(target, "Synchronized");
		Caller3a ob3 = new Caller3a(target, "World");

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
