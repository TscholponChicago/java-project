package array;

public class PrintElementValues {

	public static void main(String[] args) {
		//create array cars and assign values: Audi,Honda,BMW,Tesla
		String countries[] = {"Kyrgyzstan","Uzbekistan","Russia", "Kazakhstan","Tokio","Ukrain"};
		System.out.println(countries.length);
		
		int a = 0;
		System.out.println(countries[a]);
		a+=3;
		System.out.println(countries[a]);
		
		//print all values using a for loop
		for(int i = 0; i < countries.length; i++) {
			System.out.println(countries[i]);   
			
			System.out.println("----For each loop----");
	    // print all values using an each for loop
			for(String country : countries) {
				System.out.println(country);
				
				
			}
		}
			
			
		}
		
	

}
