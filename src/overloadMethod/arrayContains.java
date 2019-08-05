package overloadMethod;

import java.util.Arrays;

public class arrayContains {

	public static void main(String[] args) {
		int [] arr = {34,22,76,12,64,99,80};
		
		                      //         num  target
		System.out.println(arrayContains(arr,33));
		String[] words = {"hi","five","ten","bye"};
		String [] newWords = addingWord(words,"honda");
		
		System.out.println(Arrays.toString(newWords));
	}
	//task: write meth that accepts an int [] and int
	//method should check if arr contains given target int
	//if it contains return true, otherwise return false
	public static boolean arrayContains(int num[], int target) {
		boolean check = false;
		for(int i : num) {
			if(i == target) {
				return true;
			}
		}
		return false;
	}
	//task 2:write meth that accepts a string[] and string.
	//meth should copy all axisting elements to new arr
	//and add given String as a last element.Return new arra
	public static String[] addingWord(String[] arr, String word) {
		String [] newArr = new String[arr.length + 1];
		
		for(int i = 0; i < arr.length; i++) {
			newArr[i] = arr[i];
		}
		newArr[newArr.length - 1] = word;
		return newArr;
		
	}
	// task3: overload the above meth.Meth should accept String array
	//String and int(total 3 parameth). Method should insert given String
	//value to the given integ index. Also meth should keep all axisting elements
	//int the end return new array
    public static String[] addingElements(String[] arr, String word, int num) {
    	String [] newArr = new String[arr.length + 1];
    	int in = 0;
    	for(int a = 0; a < newArr.length;a++) {
    		if(a == num) {
    			newArr[a] = word;
    		}else {
    			newArr[a] = arr[in];
    			in++;
    		}
    		
    	}
    	return newArr;
    }
}
