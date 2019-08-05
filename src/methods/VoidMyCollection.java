package methods;

import java.util.Arrays;

public class VoidMyCollection {

	public static void main(String[] args) {

     int [] array = {23,33,65,87,-88,-99};
     
     printNegativeNums(array);
     
     int[] arr = {23,55,-66,-88};
     replaceNegativeNum(arr, 3);//change negative integer inside of array to given int: all elements are replace with given num	
		
	}
	
	public static void printNegativeNums(int [] nums) {
		//int negative = 0;
		for(int num : nums) {
		   if(num < 0) {
			//  negative += numbers[a]; 
			   System.out.println(num);
		   }
		}  
		}
	// task: write method that accepts array and int
	//method shoul replace negative val with given int
	//print array in the end
	public static void replaceNegativeNum(int[] zifri, int num) {
		for(int i = 0; i < zifri.length; i++ ) {  // i
			if(zifri[i] < 0) {  // __-3____-2____-1___0__+1___+2___+3_______
				zifri[i] = num;
			}
			
		}
		System.out.println(Arrays.toString(zifri));
	}

}
