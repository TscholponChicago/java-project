package selfStudy;

public class LengthOfWordIsMoreInArray {

	public static void main(String[] args) {

  String name [] = {"Cholpon","Chinara","Rabia","Kuka"};
  for(int a = 0; a < name.length; a++) {
	  System.out.println();
	  System.out.println(name[a]);
	  
	  System.out.println(a);
  }
		
		String animal[] = {"elephanat","dog","cat","dragon"};
		for(int b = 0; b < animal.length; b++) {
			if(animal[b].length() >= 4) {
				System.out.println(animal[b]);
			}
		}
		System.out.println();
		
	}

}
