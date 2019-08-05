package groupProject1;

import java.util.Scanner;

public class Project4 {

	public static void main(String[] args) {
		/*Write pro that prompts the user to enter the word 
		 * and prints numbers of occurrences of each chars
		 */ 
		 
		Scanner input  = new Scanner(System.in);
		 System.out.println("Enter word:");
		    String str = input.next().toLowerCase();
		    
		String fin = "";
	    int []count = new int[str.length()];
	    
	    for(int i = 0; i < str.length(); i++){
                char a = str.charAt(i);
                
                if(fin.contains(a + "")){
                    continue;
                }
	     for(int j = i; j < str.length(); j++){
                    char b = str.charAt(j);

                    if(a == b){
                        count[i]++;
                    }
                }
                fin += a;
	    	   
                System.out.print(a + ":" + count[i] + " ");
            }
	 
    
    
		

	}

}
