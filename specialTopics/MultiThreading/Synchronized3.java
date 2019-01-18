package specialTopics.MultiThreading;

// Callme3 - Example of synchronized

class Callme3 {
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

class Caller3 implements Runnable {
	String msg;
	Callme3 target;
	Thread t;

	public Caller3(Callme3 targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
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

class Synch3 {
	public static void main(String[] args) {
		Callme3 target = new Callme3();   // creating the same instant of an object
		Caller3 ob1 = new Caller3(target, "Hello");
		Caller3 ob2 = new Caller3(target, "Synchronized");
		Caller3 ob3 = new Caller3(target, "World");

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
