package array;

public class ArrayTasks {

	public static void main(String[] args) {
		//My and Nazar version
		String str = "[";
		int ToString [] = {23,23,34,56,342,2};
		for(int a = 0; a < ToString.length; a ++) {
           str += ToString[a] + ",";
		}
		System.out.println(str.substring(0,str.length()-1)+"]");
		
		
		// Esen's version
		int numbers [] = {23,444,567,777,87};
		String result = "[";
		for(int b = 0; b < numbers.length; b++) {
			if(b == numbers.length-1) {
				result += numbers[b] + "]";
				
			}else {
				result += numbers[b] + ", ";
			}
		}
		System.out.println(result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
