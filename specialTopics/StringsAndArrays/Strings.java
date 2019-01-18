package specialTopics.StringsAndArrays;

public class Strings {

	public static void main(String[] args) {
		String s = new String();    // to create an empty string
		System.out.println("s = " + s);
		System.out.println("s.length = " + s.length());
		
		char[] a = {'a', 'b', 'c','d','e','f'};
		String s2 = new String(a);     // to create a string initialized by an array of characters
		System.out.println("s2 = " + s2);

		String s3 = new String(a,2,3);     // initialized by an array starting at pos 2, length of 3 chars
		System.out.println("s3 = " + s3);
		
		String s4 = new String(s3);     // copy another string
		System.out.println("s4 = " + s4);

		String s5 = "abc";     // using string literal
		System.out.println("s5 = " + s5);

		// ============================================
		// use regionMatches() to compare substrings
		String Foobar = "Foobar";
		String bar = "bar";
		String Bar = "Bar";
		
		System.out.println("Match1 = " + Foobar.regionMatches(4, bar, 1, 2));
		System.out.println("Match2 = " + Foobar.regionMatches(3, bar, 1, 2));
		
		System.out.println("Match3 = " + Foobar.regionMatches(3, bar, 0, 3));
		System.out.println("Match3 = " + Foobar.regionMatches(3, Bar, 0, 3));  // lettercase do not match
		System.out.println("Match3 = " + Foobar.regionMatches(true, 3, Bar, 0, 3));  // ignore lettercases
		
		System.out.println("startsWith = " + Foobar.startsWith("Foo"));
		System.out.println("endsWith = " + Foobar.endsWith("bar"));
		System.out.println("endsWith = " + Foobar.endsWith("Bar"));
		
	}
}
