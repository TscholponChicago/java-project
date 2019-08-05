package array;

public class ArrayLength {

	public static void main(String[] args) {
    //declare array names that stores 5 names
		String names[] = {"Cholpon","Ulanbek","Yaseen","Hanna","Vildan"};
//		System.out.println(names.length);
//        String name = names[1];
//        System.out.println(name.length());
//		
//        int num[] = {3,4,5};
//        System.out.println(num.length);
//		
//        String city[] = {"chicago", "new york","osh","kdhhf","skdhf"};
//        System.out.println(city.length);
		
		for(int a =0; a < names.length;a++) {
			if(names[a].startsWith("C")) {
				System.out.println(names[a]);
			}
		}
		

	}

}
