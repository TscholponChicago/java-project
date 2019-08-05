package selfStudy;

import java.util.Arrays;
import java.util.Random;

public class Animal {

	public static void main(String[] args) {
	
		
		int[] nums= {12,34,456,7,8,879,989,8888};
		int biggest = nums[0];
		int size  =nums.length;
		for(int i =0; i < nums.length;i++) {
			if(nums[i] > biggest) {
				biggest = nums[i];
			}
		}
		System.out.println(biggest);
		int smallest = nums[0];
		for(int j =0; j < size; j++) {
			if(nums[j] < smallest) {
				smallest = nums[j];
			}
		}
		System.out.println(smallest);
		String[] words = {"horosho","ploho","apple","international","pi"};
		int len = words.length;
		String longest = words[0];
		for(int y =0; y < len; y++) {
			if(words[y].length() > longest.length()) {
				longest = words[y];
			}
		}
		System.out.println(longest);
		String shor = words[0];
		for(int u =0; u < len; u++) {
			if(words[u].length() < shor.length()) {
				shor = words[u];
			}
		}
		System.out.println(shor);
		int[] ar= {43,324,546,77,8,90,9};
		int first = ar[0];
		int last = ar[ar.length-1];
		for(int h =0; h<ar.length; h++) {
			
		}
		System.out.println();
		
		int [] arr = new int [5];
		for(int h=0; h < arr.length;h++) {
			arr[h] = 2*h;
			
		}
		System.out.println(Arrays.toString(arr));
		char[] let = {'a','b','c','d','e'};
		for(int r=0;r<let.length;r++) {
			System.out.println(let[r]);
			
		}
		int [][] box = {{99,33,22},{22,33,454},{44,77,55}};
		int total=0;
		for(int o=0; o < 3; o++) {
			total+=box[1][0];
		}
		 
		}
	}


