package selfStudy;

public class PrintFirstChar {

	public static void main(String[] args) {

    String names[] = {"Chopa","kuka","dinara","ulanbek"};
    for(int a = 0; a < names.length; a++) {
    	char letter = names[a].charAt(0);
    	System.out.println(letter);
    }
		
		System.out.println();
		String city[] = {"bishkek","cholponata","osh","jalalabad"};
		for(int b = 0; b < city.length; b ++) {
			String cit = city[b];
			System.out.println(city[b]);
		}
		
		
		
	}

}
