package specialTopics.Generics;

class Stats3<T extends Number> {
	T[] nums;
	
	Stats3(T[] o){          // constructor
		nums = o;
	}
	
	double average() {      // returns the average value of all the elements in the array
		double sum = 0.0;
		for(int i=0; i<nums.length ; i++)
			sum += nums[i].doubleValue();  // this line works because T is forced to be of Number class
		return sum/nums.length;
	}
	
	boolean sameAvg(Stats3<?> ob) {        // wild card - ? indicates that the type can be of any type
		if(average() == ob.average())
			return true;
		
		return false;
	}
}

class WildDemo3{
	public static void main(String[] args) {
	
		Integer inums[] = {1,2,3,4,5};
		Stats3<Integer> iOb = new Stats3<>(inums);   	
		double v = iOb.average();
		System.out.println(v);

	// OK - works only when comparing 2 objects of the same type
		Stats3<Integer> iOb2 = new Stats3<>(inums);   	
		if(iOb.sameAvg(iOb2))
			System.out.println("Int/Int Same average");
		else
			System.out.println("different average");
		
	// OK - works when comparing 2 objects of different types (now that we are using the wild card
		Double d2nums[] = {1D,2D,3D,4D,5D};
		Stats3<Double> d2Ob = new Stats3<>(d2nums);   		
		if(iOb.sameAvg(d2Ob))                 
			System.out.println("Int/Dbl Same average");
		else
			System.out.println("different average");
		
	// Doubles
		Double dnums[] = {1.2,2.0,3.4};
		Stats3<Double> dOb = new Stats3<>(dnums);   
		double d = dOb.average();
		System.out.println(d);
		if(iOb.sameAvg(dOb))                
			System.out.println("Int/Dbl Same average");
		else
			System.out.println("Int/Dbl different average");
		
		
		
	}
}
