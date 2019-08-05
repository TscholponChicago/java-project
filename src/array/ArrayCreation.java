package array;

public class ArrayCreation {

	public static void main(String[] args) {
		int [] numbers = new int[3];
		numbers[0] = 3;
		numbers[1] = 4;
		numbers[2] = 44;
		System.out.println(numbers[2]);
		
		numbers[2] = 88;
		System.out.println(numbers[2]);
		numbers[2] = numbers[0] + numbers[1];
		System.out.println(numbers[2]);
		
		char [] grades = {'A', 'B', 'C', 'D'};
		System.out.println(grades[3]);
		
		char myGrade = grades[2];
		System.out.println(myGrade);
      
		String cities [] = {"Chicago", "New York", "Ohio"};
		System.out.println(cities[2]);
		
		
		
	}

}
