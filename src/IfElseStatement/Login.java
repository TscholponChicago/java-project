package IfElseStatement;

import java.util.Scanner;
public class Login {

	public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your age:");
		int age = scan.nextInt();
//		int age1 = 21 - age;
//		
//		if(age >= 21) {
//			System.out.println("Welcome to club");
//		}else{
//			System.out.println("Not enough age!");
//			System.out.println("Come back in "+age1+" years");
        if(age >=0 && age <= 120) {
        	System.out.println("You may enter.Valid age.");
        }else {
        	
        	System.out.println("Invalid age");
        }		
		
		
		
		
		
		
		}
       
		
		
		
		
		
	}


