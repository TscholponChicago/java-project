package array;

public class Cities {

	public static void main(String[] args) {
		int count = 0;
		
		String cities [] = {"Chicago","New York","Madison","Miami","Washington"};
		for(int a = 0; a < cities.length; a++) {
			if(cities[a].equals("Chicago")) {
				
				count++;
			}
		}if(count == 0) {
			System.out.println("Windy city not found.");
		}else {
			System.out.println("Windy city found "+count +" times");
		}	
				//Esen's version
		boolean check = true;
		for(int i = 0; i < cities.length; i++) {
			if(cities[i].contentEquals("Chicago")) {
				System.out.println("windy city found");
				check = false;
				break;
			}
		}
		if(check) {
			System.out.println("Windy city is not found");
		}
		
		
		
		
		
		
		}
		
		
		
		
		
		
		
		
		
		
	}


