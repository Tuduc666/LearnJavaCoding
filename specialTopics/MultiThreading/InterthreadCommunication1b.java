package specialTopics.MultiThreading;

/*
 * An incorrect implementation of producer and consumer - Thread
 */
class Qb {
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

class Producerb extends Thread {
	Qb q;

	Producerb(Qb q) {
		this.q = q;
	}

	public void run() {
		int i = 0;

		while (true) {
			q.put(i++);
		}
	}
}

class Consumerb extends Thread {
	Qb q;

	Consumerb(Qb q) {
		this.q = q;
	}

	public void run() {
		while (true) {
			q.get();
		}
	}
}

class pcb {
	public static void main(String[] args) {
		Qb q = new Qb();
		Producerb p = new Producerb(q);
		Consumerb c = new Consumerb(q);

		p.start();
		c.start();

		System.out.println("Press ctrl-C to stop.");
	}
}
