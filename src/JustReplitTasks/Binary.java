package JustReplitTasks;

import java.util.Arrays;
import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
     Scanner scan  = new Scanner(System.in);
     int dec = scan.nextInt();
     int [] bin = new int[8];
     int check = 128;
     for(int a = 0; a < bin.length; a++) {
    	 if(dec >= check) {
    		 bin[a] = 1;
    		 dec -= check;
    		
    	 }else {  
    		 bin[a] = 0;
    	 }	
    		 check /=2;
    	 }

     System.out.println(Arrays.toString(bin));
		
		
	}
}

