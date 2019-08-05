package selfStudy;

import java.util.Arrays;
import java.util.Scanner;

public class ConsistOfTwoOrMoreWords {

	public static void main(String[] args) {
		
		String kitchenItems[] = {"Knife","Spoon","Plate","Dish washer","Silver Plate","Trash can"};
		
		for(int a = 0; a < kitchenItems.length; a++) {
			if(kitchenItems[a].trim().contains(" ")) {
				System.out.println(kitchenItems[a]);
			}
			
		}
		String verbs[] = {"hurry up","be quick","run","jump","hands up"};
		for(int b = 0; b < verbs.length; b ++) {
			if(verbs[b].trim().contains(" ")) {
				System.out.println(verbs[b]);
			}
		}
		
	}

}
