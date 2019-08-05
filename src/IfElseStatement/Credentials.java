package IfElseStatement;

import java.util.Scanner;
public class Credentials {

	public static void main(String[] args) {

     String userName = "test";
     String pass = "abc123";
     /*write code that takes username and pass from console
      * check if both username and pass are matching , if matching
      * print "wlcome , username
      * if username is corre but pass is incorr print pass incorre
      * if username is incorrect but pass is corr print username is incorr
      * else print valid credential
      */
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Please enter your name and password:");
        String name = scan.nextLine();
        String enterPass = scan.nextLine();
        if(name.equals(name) && enterPass.equals(pass)) {
        	System.out.println("Welcome "+ name);
        }else if(name.equals(userName) && !enterPass.equals(pass)) {
        	System.out.println("Password is incorrect!");
        }else if(!name.equals(userName) && enterPass.equals(pass)) {
        	System.out.println("User name is incorrect!");
        }else {
        	System.out.println("Invalid credentials!");
        }
	  
	  
		  }
	  
		
		
		
	}


