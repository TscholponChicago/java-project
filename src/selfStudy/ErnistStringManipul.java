package selfStudy;

public class ErnistStringManipul {

	public static void main(String[] args) {

     String str = "Bananabanana";
     
     String firstHalf =str.substring(0, 6) ;
     String secondHalf = str.substring(6);
     
     String firstCharacterSecondHalf =secondHalf.substring(0, 1).toUpperCase(); 
   //  firstCharacterSecondHalf = firstCharacterSecondHalf.toUpperCase();
     
     System.out.println(firstCharacterSecondHalf);
     str = firstHalf + " " + firstCharacterSecondHalf + secondHalf.substring(1);

     
 // or we can just do: str = str.substring(0,6) + " " + str.substring(6,7).toUpperCase()
     //+ str.substring(7);
     
     
     
     
     
     
     
	}
}