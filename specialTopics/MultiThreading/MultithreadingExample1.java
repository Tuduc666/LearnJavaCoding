package specialTopics.MultiThreading;

/*===============================================================================================
 * -----------        https://freejavatutorial.000webhostapp.com/      -----------
 *  For a complete java tutorial course, please visit our Free Java Tutorial website above.
 *  We will be adding new lessons to that website weekly. 
 *  
 * -----------        https://www.aspropertiesnyc.com/                 -----------
 *  For a list of selected real estate properties in New York City for sale and rental...
 *  please visit our AS Properties NYC website.  New properties are updated daily.
 *  
 * -----------     ***   Special Note   ***                            -----------
 *  So we can keep making these great videos, please help support us by clicking SUBSCRIBE, 
 *  to subscribe to our YouTube channel.  Thank you so much for your support. 
 *===============================================================================================*/

class NewThreadExample1 implements Runnable {
	Thread t;
	String name;

	public NewThreadExample1(String name) {
		this.name = name;
		t = new Thread(this, name);
		System.out.println("New thread " + name + " created.");
	}

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 3; i++) {
				System.out.println("Thread " + name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		System.out.println("Thread " + name + " ends.");
	}
}

class MultithreadingExample1 {

	public static void main(String[] args) {
		NewThreadExample1 N1 = new NewThreadExample1("N1");
		NewThreadExample1 N2 = new NewThreadExample1("N2");
		NewThreadExample1 N3 = new NewThreadExample1("N3");

		N1.t.start();
		N2.t.start();
		N3.t.start();

		System.out.println("Exiting main program.");

	}

}
