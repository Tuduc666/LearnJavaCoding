package specialTopics.Generics;

//ERROR!!!! compiler error since T can be of any type, not just numbers
class StatsError<T> {
	T[] nums;
	
	StatsError(T[] o){          // constructor
		nums = o;
	}
	
	double average() {      // returns the average value of all the elements in the array
		double sum = 0.0;
//		for(int i=0; i<nums.length ; i++)
//			sum += nums[i].doubleValue();  // ERROR!!!! compiler error since T can be of any type, not just numbers
//		return sum/nums.length;
		return sum;
	}
}
