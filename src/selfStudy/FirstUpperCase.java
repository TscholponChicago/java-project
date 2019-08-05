package selfStudy;

public class FirstUpperCase {

	public static void main(String[] args) {

     String dream[] = {"Ocean","books","Friend","food"};
     String dream1[] = {"Ocean","books","Friend","food"};
     
     
     for(int a = 0; a < dream.length; a++) {
    	 char letter = dream[a].charAt(0);
    	 if(Character.isUpperCase(letter)) {
    		 continue;
    	 }
     }
     
     
     
     
	}

}
