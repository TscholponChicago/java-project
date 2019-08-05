package varargsTasks;

import java.util.Arrays;

public class VarArgs {

	public static void main(String[] args) {
		printWords("red", "blue", "green");
		printWords("black", "white");
		printNames("Cholpon", "Nazar", "Rabia", "Hamza", "Rose", "Chinara");
		numbers(12, 34, 5, 564, 46, 67, 78, 87, 789, 98, 908, 454, 4465, 7, 67, 67, 67);
		System.out.println(summ(23,5,456));
		System.out.println(subtr(34));
		System.out.println(subb(23,1,34,56));
		cook("banana","bread","salsa");
	}

	public static void printWords(String... words) {
		// handle it like Array
		for (String s : words) {
			System.out.println(s);
		}
	}

	public static void printNames(String... names) {
		for (String s : names) {
			System.out.println(s);
		}

	}

	public static void numbers(int... nums) {
		// System.out.println(nums[0]); 
		for (int a : nums) {
			System.out.print(a+" ");
		}
		System.out.println();
	}
  public  static int summ(int... numb) {
		int sum = 0;
		for(int n : numb) {
			sum += n;
		}
		return sum;
	}
  public static int subtr(int... nums) {
	  int sub = 99;
	  for(int a : nums) {
		  sub -= a;
	  }
	  return sub;
  }
  public static int subb(int... zifri) {
	  int minus = 100;
	  for(int i : zifri) {
		  minus -= i;
	  }
	  return minus;
  }
  public static void cook(String name,String ... words) {
	  System.out.println("food: "+name);
	  System.out.println(Arrays.toString(words));
  }

}
