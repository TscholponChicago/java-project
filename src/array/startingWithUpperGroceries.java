package array;

public class startingWithUpperGroceries {

	public static void main(String[] args) {
	//TASK array with these values, count how many words are starting with uppercase
		// print "Total words starts with upper case: 3
	String groceries[] = {"Bread","Cucumber","apples","orange","cookies","Cake"};
	int len = groceries.length;
	int counter = 0;
	for(int a = 0; a < groceries.length; a++) {
		char letter = groceries[a].charAt(0);
		if(Character.isUpperCase(letter)) {
			counter ++;
		}
		System.out.println(letter + " ");
	} 
	
	System.out.println("Total words start with upper: "+counter);
	System.out.println();
	
	System.out.println("Esen's version is below:");
	// Esen's version, using ASCCII table
	int count = 0;
	String animals[] = {"Elephant", "dog","cat","Monkey","Tiger"};
	for(String animal : animals) {
		char c = animal.charAt(0);
		int b = c; // converts char to int, it will help to
		if(b >= 65 && b <= 90) { // just capital letters
			count ++;
		}
	}
	
	System.out.println("Total words "+count + " start with upper case");
	

	}

}
