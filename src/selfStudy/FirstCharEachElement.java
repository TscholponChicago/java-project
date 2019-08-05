package selfStudy;

public class FirstCharEachElement {

	public static void main(String[] args) {
		//task print each first letter from each word
		String animals[] = {"elephant","dog","monkey","cat","hippo"};
		for(int a = 0; a < animals.length; a++) {
			System.out.println(animals[a].charAt(0));
			
		}
		String fruits[] = {"apple","banana","kiwi","mango"};
		for(int b = 0; b < fruits.length; b++) {
			System.out.println(fruits[b].charAt(0));
			if(fruits[b].contains("a")) {
				System.out.println(fruits[b]);
				if(fruits[b].contains("w")) {
					System.out.println(fruits[b]);
				}
			}
		}
		String city[] = {"bishkek","tashkent","kiev","moscow"};
		for(int t = 0; t < city.length; t++) {
			if(city[t].endsWith("w")) {
				System.out.println(city[t]);
			}if(city[t].startsWith("t")) {
				System.out.println(city[t]);
			}
			
		}

	}

}
