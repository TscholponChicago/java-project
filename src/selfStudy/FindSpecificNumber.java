package selfStudy;

public class FindSpecificNumber {

	public static void main(String[] args) {
		int num [] = {45,66,11,22,34};
		int find = 0; 
		for(int i = 0; i < num.length; i++) {
			if(num[i] == 11) {
				find =i;
				System.out.println(find);
			}
		}
		
		System.out.println();
		// reverse numbers
		int numbers [] = {45,66,12,22,78};
		for(int a = numbers.length -1; a >= 0; a--) {
			System.out.print(numbers[a] +" ");
		}
		
	}

}
