package selfStudy;

public class UniCh {

	public static void main(String[] args) {
		
		String word = "Kyrgyzstanmekenim";
		String uni = "";
		for(int a = 0; a < word.length(); a++) {
			char letter = word.charAt(a);
			if(uni.contains(letter +"")) {
				continue;
			}
			uni += letter;
		}
		System.out.println(uni);
		
		

	}

}
