package Operators;

public class ComparisonOperators {

	public static void main(String[] args) {

      int a = 23;
      int b = 44;
      System.out.println(a > b);
	  System.out.println(a < b);
	  
	  int num1 = 33;
	  int num2 = 33;
	  System.out.println(num1 <= num2);
	  System.out.println(num1 >= num2);
		
	  double c = 44;
	  double s = 74;
	  System.out.println(c == s);
	  
	  boolean result = c >= s;
	  System.out.println(result);
	  
	  boolean test = c != s;
	  System.out.println(test);
	  
	  int book = 23;
	  int book1 = 34;
	 // System.out.println(book >= book1);
	  boolean books = book >= book1;
	  System.out.println(books);
	  
	  char letter1 = 'A';
	  char letter2 = 'B';
	  System.out.println(letter1 > letter2);
	  System.out.println(letter2 > letter1);
	  
	  boolean b1 = letter1 < letter2;
	  boolean b2 = letter2 > letter1;
	  
	  System.out.println(b1);
	  System.out.println(b2);
	  
	  boolean b3 = b1 == b2;
	  System.out.println(b3);
	  boolean b4 = b1 == b2;
	  System.out.println(b4);
	  
	  
	  
	  
	}

}
