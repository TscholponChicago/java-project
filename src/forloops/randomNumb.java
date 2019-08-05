package forloops;

import java.util.Random;
import java.util.Scanner;

public class randomNumb {

	public static void main(String[] args) {
    Random ran = new Random();
    int num = ran.nextInt(100);
    int attempts = 0;
    for(int a= 0; a < 100; a++) {
    	attempts ++;
    	
    	if(a == num) {
    		
    	System.out.println("Target number is "+ num);
    	
		System.out.println("Target number is found.");
		
		System.out.println("Number of attempts:"+ attempts);
		break;
    	}
		
		}
		
		
		
	}

}
