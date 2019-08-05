package array;

public class ForLoopLength {

	public static void main(String[] args) {
     //TASK 1: if elements are less than 4 chars dont print that word
   String name[] = {"chopa","yuliya","hanna","yaseen","vildan","tom"};
   int len = name.length;
   for(int a = 0; a < len; a++) {
	   if(name[a].length() <= 4) {
		   System.out.println(name[a]);
	   }
   }
   
   String cars[] = {"Toyota","BMW","Honda", "Tiko","Kia"};
   int l = cars.length;
   for(int b = 0 ; b < l; b++) {
	   if(cars[b].length() >= 3) {
		   System.out.println(cars[b]);
	   }
   }
   
   
   
   }
    
     
	}


