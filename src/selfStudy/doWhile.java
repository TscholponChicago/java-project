package selfStudy;

import java.util.Scanner;

public class doWhile {

	public static void main(String[] args) {

   Scanner scan = new Scanner(System.in);
//    int num = 1;
//	while(num < 5) {
//		System.out.println(num);
//		num++;
//	}
//		System.out.println("number after loop = "+num);
////	
//      int countDown;
//   for(countDown = 3; countDown >=0; countDown--) {
//	   System.out.println(countDown);
//	   System.out.println("and counting");
//   }
//   System.out.println("Blast off!");
//   
//   int product = 1, number;
//   for(number =1; number <=10; number++) {
//	   product = product * number;
//   }
//   System.out.println("products of the numbers 1 thought" 
//   +" 10 is"+ product);  
//   
//   for(double test = 0; test <3; test=test+0.5) {
//	   System.out.println(test);
//   }
   int even =10;
   for(int a =2; a <= even;a++) {
	   if(a % 2 == 0) {
		   System.out.println(a);
	   }
   }
   
	}

}
