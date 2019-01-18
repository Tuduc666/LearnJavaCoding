package simpleJavaCoding;

import java.util.Scanner;

import specialTopics.ObjectClass.Car;
import specialTopics.ObjectClass.CarCAN;
import specialTopics.ObjectClass.CarMEX;
import specialTopics.ObjectClass.CarUS;

public class CarMainRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Car selectedCar = new Car("No car selected", 0);
		
		CarUS us1 = new CarUS("BMW", 40000);
		CarCAN can1 = new CarCAN("BMW", 35000);
		CarMEX mex1 = new CarMEX("BMW", 32000);
		
		System.out.println("What country do you live in?");
		System.out.println("1. US \r\n"
				+ "2. CAN \r\n"
				+ "3. MEX");
		int country = sc.nextInt();	
		switch (country) {
			case 1: selectedCar = us1;
			break;
			case 2: selectedCar = can1;
			break;
			case 3: selectedCar = mex1;
			break;
		}
		
		// even though selectedCar is of type Car, it knows which inclTax() method to use 
		// based on the assignment in the switch statement above
		System.out.println(selectedCar.getName() + " final price will be " 
		                           + selectedCar.inclTax(selectedCar.getPrice())); 	
		
		
		// so in fact we are defining only one Car class, and we were able to apply it to different scenarios
		// by extending the Car class and modifying the method in each one.
		// We did not need to re-define the Car class in each case.
		sc.close();
	}
}
