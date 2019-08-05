package array;

import java.util.Arrays;

public class myTeam {

	public static void main(String[] args) {
     String [] myTeam = new String[4];
     myTeam [0] = "Cholpon";
     myTeam [1] = "Ulanbek";
     myTeam [2] = "Hannamaria";
     myTeam [3] = "Vildan";
     System.out.println(myTeam[1]);
     System.out.println(myTeam[2]);
     System.out.println(myTeam[0] + " " + myTeam[3]);
	 // declare and initialize double array for prices
     // store folowing prices: 45.99 , 23.5, 11.50, 33.44, 99.99
     // then change the last element to 112.89
     //print all values using Arrays.toString
     
     double [] prices= new double[5];
     prices[0] = 45.99;     // double [] prices= {45.99 , 23.5, 11.50, 33.44, 99.99};
     prices[1] = 23.50;
     prices[2] = 11.50;
     prices[3] = 33.44;
     prices[4] = 99.99;
     prices[4] = 112.89;
     
      
     System.out.println(Arrays.toString(prices));
     //length --> arrays have a length, it returns an int, it is basicly giving a size
     System.out.println(prices.length);
	 int [] num= new int[] {3,44,5};	
	 	
	 
	}

}
