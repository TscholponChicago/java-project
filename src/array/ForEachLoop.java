package array;

public class ForEachLoop {

	public static void main(String[] args) {
       String animals[] = {"Tiger","Wolf","Elephant","Monkey","Cat"};
       System.out.println(animals.length);
       String a = animals[2];
       System.out.println(animals[2]);
	   for(int c = 0; c < animals.length; c++) {
		   System.out.println(animals[c]);
	   }
		for(String animal : animals) {
			System.out.println(animal);
		}
		
		int numbers[] = {23,44,56,78};
		for(int num : numbers) {
			System.out.println(num);
		}
		
		
		
	}

}
