package array;

import java.util.Arrays;

public class arrayIntroduction {

	public static void main(String[] args) {
     int num[] = new int [3];
     num[0] = 34;
     num[1] = 22;
     num[2] = 55;
     System.out.println(num[2]);
     System.out.println(Arrays.toString(num));	
     
     String name[] = new String[3];
     name [0] = "Hanna";
     name [1] = "vildan";
     name [2] = "yaseen";
     System.out.println(name[2]);
	 System.out.println(Arrays.toString(name));
		
	String city[] = new String[3];
	city [0] = "Chicago";
	city[1] = "New York";
	city [2] = "Osh";
	System.out.println(Arrays.toString(city));
	
	int i[] = new int[2];
	i[0] = 56;
	i[1] = 44;
	System.out.println(Arrays.toString(i));
	
	String count [] = new String[3];
	count[0] = "one";
	count[2] = "two";
	count[1] = "three";
	
    System.out.println(Arrays.toString(count));
    
    String toys[] = new String[6];
    toys [0] = "doll";
    toys [1] = "puppy";
    toys [2] = "ball";
    toys [3] = "book";
    toys [4] = "plane";
    toys [5] = "comp";
    
    System.out.println(toys[0] + " " + toys[2]);
    System.out.println(toys[3] + " " + toys[5]);
    System.out.println(Arrays.toString(toys));
    
    double price[] = {56.66, 23.44, 88.88};
    System.out.println(Arrays.toString(price));
    // to change the last double
    price [2] = 22.11; //reassigning
    System.out.println(Arrays.toString(price));
    
    
    
    
	}

}
