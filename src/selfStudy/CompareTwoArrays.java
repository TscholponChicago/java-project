package selfStudy;

public class CompareTwoArrays {

	public static void main(String[] args) {
    
		String country [] = {"Kyrgyzstan","uzbekistan","tatarstan","kazakhstan"};
		String country1 [] = {"Kyrgyzstan","uzbekistan","tatarstan","kazakhstan"};
		boolean same = true;
		for(int a = 0; a < country.length; a++) {
			if(country[a].equals(country1[a])) {
				same = true;
				continue;
			}else {
				same = false;
				break;
			}
		}if(same) {
			System.out.println("They are same");
		}else {
			System.out.println("Not same");
		}
		System.out.println();
	
		/// Esen's version
		String cars1 [] = {"Toyota","Honda","Kia","Porsch","BMW"};
	    String cars2 [] = {"Toyota","Honda","Kia","Porsch","BMW"};
		int count = 0;
		if(cars1.length == cars2.length) {
			for(int a = 0; a < cars1.length;a++) {
	    	String c1 = cars1[a];
	    	String c2 = cars2[a];
	    	if(c1.equals(c2)) {
	    		count ++;
	    	}
	    }
		}if(count == cars1.length) {
			System.out.println("they are same");
		}else {
			System.out.println("they are not same");
		}
	    
	    
	     
	     
	     
	     
		
		
		
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

