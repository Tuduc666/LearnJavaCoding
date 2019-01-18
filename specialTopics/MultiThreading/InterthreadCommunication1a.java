package specialTopics.MultiThreading;

/*
 * An incorrect implementation of producer and consumer - Thread
 */
class Qa {
	int n;

	synchronized int get() {
		System.out.println("Got: " + n);
		return n;
	}

	synchronized void put(int n) {
		this.n = n;
		System.out.println("Put: " + n);
	}
}

class Producera extends Thread {
	Qa q;
	Thread t;

	Producera(Qa q) {
		super("Producer");
		t = this;
		this.q = q;
	}

	public void run() {
		int i = 0;

		while (true) {
			q.put(i++);
		}
	}
}

class Consumera extends Thread {
	Qa q;
	Thread t;

	Consumera(Qa q) {
		super("Consumer");
		t = this;
		this.q = q;
	}

	public void run() {
		while (true) {
			q.get();
		}
	}
}

class pca {
	public static void main(String[] args) {
		Qa q = new Qa();
		Producera p = new Producera(q);
		Consumera c = new Consumera(q);

		p.start();
		c.start();

		System.out.println("Press ctrl-C to stop.");
	}
}
