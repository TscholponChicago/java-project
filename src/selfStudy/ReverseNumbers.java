package selfStudy;
import java.util.Arrays;
public class ReverseNumbers {
	public static void main(String[] args) {
		
	
		String sum = "";
     int[] num  = {45, 55, 66, 112, 33, 34, 455, 66};
     for(int a = 0; a < num.length; a++) {
    	
    	sum += num[a] +" ";
     }
		System.out.println(sum);
		
		int total=0;
		int nu [] = {56,33,555};
		for(int b = 0; b< nu.length; b++) {
			total += nu[b];
			
		}
		
		System.out.println(total);
		int t = 0;
		for(int p = 0; p < num.length; p++) {
			if(num[p] == 112) {
				t = p;
			}
		}
		System.out.println(t); 

	}

}
