package specialTopics.Generics;

class Stats2<T extends Number> {
	T[] nums;
	
	Stats2(T[] o){          // constructor
		nums = o;
	}
	
	double average() {      // returns the average value of all the elements in the array
		double sum = 0.0;
		for(int i=0; i<nums.length ; i++)
			sum += nums[i].doubleValue();  // this line works because T is forced to be of Number class
		return sum/nums.length;
	}
	
	boolean sameAvg(Stats2<T> ob) {
		if(average() == ob.average())
			return true;
		
		return false;
	}
}

class WildDemo{
	public static void main(String[] args) {
	
		Integer inums[] = {1,2,3,4,5};
		Stats2<Integer> iOb = new Stats2<>(inums);   	
		double v = iOb.average();
		System.out.println(v);

	// OK - works only when comparing 2 objects of the same type
		Stats2<Integer> iOb2 = new Stats2<>(inums);   	
		if(iOb.sameAvg(iOb2))
			System.out.println("Same average");
		else
			System.out.println("different average");
		
	// ERROR - does not compile when comparing 2 objects of different types
//		Double d2nums[] = {1D,2D,3D,4D,5D};
//		Stats2<Double> d2Ob = new Stats2<>(d2nums);   		
//		if(iOb.sameAvg(d2Ob))                 // ERROR!!!!!!!  does not compile
//			System.out.println("Same average");
//		else
//			System.out.println("different average");
		
		
	// Doubles
		Double dnums[] = {1.2,2.0,3.4};
		Stats2<Double> dOb = new Stats2<>(dnums);   
		double d = dOb.average();
		System.out.println(d);
		
		
		
	}
}
