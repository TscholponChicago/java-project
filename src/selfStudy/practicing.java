package selfStudy;

import java.util.Scanner;
public class practicing {

	public static void main(String[] args) {
		
      Scanner meerim = new Scanner(System.in);
       
      System.out.println("-------Welcome to Fashion Outlet-------");   
      
      System.out.println("How much do you have?");
      double money = meerim.nextDouble();
      System.out.println("What do you want to buy?");
	  String item1 = meerim.next();


	  String item2 = meerim.next();
	  
      System.out.println("How much does "+item1+" cost?");
      
      double price1 = meerim.nextDouble();
      
      System.out.println("How much does "+ item2+ "cost?");
      double price2 = meerim.nextDouble();
      
	  double sum = price1 + price2;
	  System.out.println("Before taxes: "+sum);
      
	  double withTaxes = (sum * 10) /100+ sum;
	  System.out.println("With taxes :"+ withTaxes);
	  
	  System.out.println("Do you want to pay by cash or card?");
	  String item3 = meerim.next();
	  System.out.println("how much?");
	  String item4 = meerim.next();
	  int item9 = 45;
	  System.out.println("It is gonna be:" + (withTaxes - item9));
	  String item5 = meerim.next();
	  System.out.println("the rest" + item5);
	  
	  
	  
	  
	  
	}
	
	
	
	
	 }
	
	
	

