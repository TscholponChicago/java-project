package array;

public class arrExsample {

	public static void main(String[] args) {
		String [] carBrands = {"Mercedes","BMW","Toyota","Ferrary"};
		for(int i =0; i < carBrands.length; i++) {
			if(carBrands[i].equals("Mercedes")) {
				System.out.println(carBrands[i]+ " : Luxury -Comfort");
			}else if(carBrands[i].equals("BMW")) {
				System.out.println(carBrands[i]+" : Luxury- Sport");
			}else if(carBrands[i].equals("Toyota")) {
				System.out.println(carBrands[i] + " : Realiable - Cheap");
			}else{
				System.out.println(carBrands[i] + ": Super car - Super expensive");
			}
				
			}
		System.out.println();
		for(String cars : carBrands) {
			if(cars.equals("Mercedes")) {
				System.out.println(cars+": Luxury -Comfort ");
			}else if(cars.equals("BMW")) {
				System.out.println(cars+" : Luxury- Sport");
			}else if(cars.equals("Toyota")) {
				System.out.println(cars+" : Realiable Cheap");
			}else {
				System.out.println(cars+" : Super car - Super expensive");
			}
		}
		}
		
		
	}


