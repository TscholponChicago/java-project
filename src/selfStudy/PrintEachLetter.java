package selfStudy;

public class PrintEachLetter {

	public static void main(String[] args) {
		String word = "International";
		// use forloop and print each letter
		for(int a = 0; a < word.length(); a++) {
			System.out.println(word.charAt(a));
		}
		//using loop print just consonants
		
		
		
		//using loop print just vowels
		
		for(int a = 0; a < word.length(); a++) {
			char letter = word.toLowerCase().charAt(a);//we can declare this if we dont 
			//want to write long
			if(letter == 'a' || letter == 'o' || letter == 'i' 
					|| letter == 'u' || letter == 'e' ) {
				System.out.print(letter+" ");
			}
		}

	}

}
