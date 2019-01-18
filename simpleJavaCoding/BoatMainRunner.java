package simpleJavaCoding;

import java.util.Scanner;

import specialTopics.ObjectClass.Boat;
import specialTopics.ObjectClass.BoatCAN;
import specialTopics.ObjectClass.BoatMEX;
import specialTopics.ObjectClass.BoatUS;

public class BoatMainRunner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Boat selectedBoat;   // no object created here     
		
		BoatUS us1 = new BoatUS("BMW", 40000);
		BoatCAN can1 = new BoatCAN("BMW", 35000);
		BoatMEX mex1 = new BoatMEX("BMW", 32000);
		
		System.out.println("What country do you live in?");
		System.out.println("1. US \r\n"
				+ "2. CAN \r\n"
				+ "3. MEX");
		int country = sc.nextInt();	
		switch (country) {
			case 1: { 
				selectedBoat = us1;
				System.out.println(selectedBoat.getName() + " final price will be " 
						+ selectedBoat.inclTax(selectedBoat.getPrice())); 	
			}
			break;
			case 2: {
				selectedBoat = can1;
				System.out.println(selectedBoat.getName() + " final price will be " 
						+ selectedBoat.inclTax(selectedBoat.getPrice())); 	
			}
			break;
			case 3: {
				selectedBoat = mex1;
				System.out.println(selectedBoat.getName() + " final price will be " 
						+ selectedBoat.inclTax(selectedBoat.getPrice())); 	
			}
			break;
		}
		
		sc.close();
	}
}
