package specialTopics.StringsAndArrays;

// every class implements toString() because it is defined by Object class
// override toString() for classes that you create, 
// to provide your own string representation.... String toString()
		

class Student {
	 private String studentID;
	 private String fn;
	 
	 public Student(String id, String fn) {     // using a constructor instead of getters functions
	    this.studentID = id;
	    this.fn =fn;
	   }
	 
	 public String getStudentID() {   return studentID;  }            // getters and setters
	 public void setStudentID(String studentID) {   this.studentID = studentID;  }
	 public String getFn() {   return fn;  }
	 public void setFn(String fn) {   this.fn = fn;  }

	 public String toString() {                         // building the default toString function.  Can right-click, source, and select option to build toString automatically
	  String message = "Student id: " + this.getStudentID() + ", Firstname: " + this.getFn();
	  return message;
	 } 
}

class MainRunner {
	 public static void main(String[] args) {                                         // main
	  Student mike = new Student("0001", "Mike");
	  Student max = new Student("0002", "Max");
	  System.out.println(mike);     // this works because println calls .toString by default
	  System.out.println(max);           // otherwise would need to call mike.toString()
	  
	  String test = "My string test: " + mike;   // this alse works because toString() is used to convert mike to a string
	  System.out.println(test);
	 }
}
