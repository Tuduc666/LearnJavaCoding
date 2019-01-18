package specialTopics.MultiThreading;

// Callme3b - Example of synchronized - synchronized does not apply to different instances of an object

class Callme3b {
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

class Caller3b extends Thread {
	String msg;
	Callme3b target;

	public Caller3b(Callme3b targ, String s) {
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

class Synch3b {
	public static void main(String[] args) {
		Callme3b target = new Callme3b();    // create one instant of an object
		Callme3b target2 = new Callme3b();    // create a different instant of the Callme3b object, synchronized only works on the same instant of an object
		Caller3b ob1 = new Caller3b(target, "Hello");
		Caller3b ob2 = new Caller3b(target2, "Synchronized");
		Caller3b ob3 = new Caller3b(target, "World");

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
