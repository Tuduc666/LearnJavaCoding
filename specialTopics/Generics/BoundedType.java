package specialTopics.Generics;

// T must be Number or a class derived from Number
class Stats<T extends Number> {
	T[] nums;
	
	Stats(T[] o){          // constructor
		nums = o;
	}
	
	double average() {      // returns the average value of all the elements in the array
		double sum = 0.0;
		for(int i=0; i<nums.length ; i++)
			sum += nums[i].doubleValue();  // this line works because T is forced to be of Number class
		return sum/nums.length;
	}
}

class BoundDemo{
	public static void main(String[] args) {
	
	// Integers
		Integer inums[] = {1,2,3,4,5};
		Stats<Integer> iOb = new Stats<>(inums);   	
		double v = iOb.average();
		System.out.println(v);
		
		
	// Doubles
		Double dnums[] = {1.2,2.0,3.4};
		Stats<Double> dOb = new Stats<>(dnums);   
		double d = dOb.average();
		System.out.println(d);
		
		
	// Strings - ERROR!!!!  won't compile bec. String is not a subclass of Number
//		String snums[] = {"hi","my"};
//		Stats<String> sOb = new Stats<>(snums);   
//		double s = sOb.average();
//		System.out.println(s);
		
	}
}
