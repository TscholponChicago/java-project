package Switch;

public class Switcher {

	public static void main(String[] args) {

//      String name = "Ulanbek";
//      switch (name) {// we can put Cholpon
//      
//      case "Hannamaria":
//    	  System.out.println("She is my oldest daughter.");
//          break;
//      case "Vildan":
//    	  System.out.println("She is my youngest daughter.");
//          break;
//      case "Yaseen":
//    	  System.out.println("He is my son.");
//    	  break;
//      default:
//    	  System.out.println("I just have 3 kids.");
//    	  System.out.println("Invalid name.I don't know this person.");
//      }
		
		String name = "Hannamaria";
	
		if(name.equals("Hannamaria")) {
			System.out.println("She is my oldest daughter.");
		}else if(name.equals("Vildan")) {
			System.out.println("She is my youngest daughter.");
		}else if(name.equals("Yaseen")) {
			System.out.println("He is my son.");
		}else {
			//System.out.println("I just have 3 kids.");
			System.out.println("I don't know this person.");
		}
		
		

	}

}
