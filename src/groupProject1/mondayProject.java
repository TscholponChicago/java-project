package groupProject1;

import java.util.Scanner;
public class mondayProject {

	public static void main(String[] args) {
		int unitPrice;
	    int quantity;
	    double grandTotal=0.0;
	    int discount=0;
	    double discountApplied=0.0;
	    double total=0.0;
	    
	    Scanner input = new Scanner(System.in);
	    
	    System.out.println("Enter unit price:");
	    unitPrice = input.nextInt();
	    
	    System.out.println("Enter quantity:");
	    quantity = input.nextInt();
	    
	    grandTotal = (unitPrice * quantity);
	    discount = 10;
	    if (quantity >= 100 && quantity <= 120){
	      discount = 10;
	    }
	     if(quantity >= 120){
	      discount = 15;
	    }
	      if(quantity <= 100 ){
	    discount = 0;
	    }
	     discountApplied = ((grandTotal*discount)/100);
	    total = grandTotal - discountApplied;
	    System.out.println("Grand Total: $ "+grandTotal);
	    System.out.println("Discount: $ "+discount);
	    System.out.println("Discount applied: $ "+discountApplied);
	    System.out.println("Total: $ : "+total);
	    
		
		
		
		
	}

}
