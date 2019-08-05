package array;

public class UniqueNumbers {

	public static void main(String[] args) {
		/*Create an array of int and store follow numb
		 * use nested loop print values that appears once
		 * (true meaning unique)
		 */ 
		
		
		int[] numbers = {5, 7, 8, 8, 11, 55, 23, 23, 23, 54, 7, 1, 2, 2};
        for(int i = 0; i < numbers.length; i++){
            int uniqueNum = numbers[i];
            boolean repeat = false;
            
            for(int j = 0; j < numbers.length; j++) {
                if(numbers[j] == uniqueNum && i != j) {
                    repeat = true;
                    break;
                }
            }
            if(repeat == false) {
                System.out.print(numbers[i] + " ");
            }
        }
		

	}

}
