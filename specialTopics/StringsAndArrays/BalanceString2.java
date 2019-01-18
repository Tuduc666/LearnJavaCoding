package specialTopics.StringsAndArrays;

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

class Stack {
	Character[] arr;
	int p;   // next position
	
	Stack(Character[] arr, int p){
		this.arr = arr;
		this.p = p;
	}
	
	void push(char a) {
		if (p >= arr.length) {
			System.out.println("Stack overflow.");
			return;
		}
		
		arr[p++] = a;
	}
	
	char pop() {
		if (p <= 0) {
			System.out.println("Stack is empty.");
			return " ".charAt(0);
		}
		
		return arr[--p];
	}
}

public class BalanceString2 {
	public static void main(String[] args) {

//		String input = "(He(l[lo{ Wor]ld)}";               // not balanced -> (([{ ])}
		String input = "{He(llo World)}";                  //  balanced    -> {( )}
		String output = "The string is balanced.";

		Stack s = new Stack(new Character[50], 0);

		forloop: for(int i=0; i<input.length(); i++)
			switch (input.charAt(i)) {
			case '(' :
				s.push(input.charAt(i));
				break;
			case '{' :
				s.push(input.charAt(i));
				break;
			case '[' :
				s.push(input.charAt(i));
				break;
			case ']' :
				if(s.pop() != '[') {
					output = "Not balanced";
					break forloop;
				}
				break;
			case '}' :
				if(s.pop() != '{') {
					output = "Not balanced";
					break forloop;
				}
				break;
			case ')' :
				if(s.pop() != '(') {
					output = "Not balanced";
					break forloop;
				}
				break;
			}
		
		System.out.println(output);	
	}	
}
