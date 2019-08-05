package IfElseStatement;

public class SwitchStatement {

	public static void main(String[] args) {

    String weather = "stormy";
    switch (weather) {
    case "nice":
    	System.out.println("Go hiking");
    	break;
    case "hot":
    	System.out.println("Go swiming");
    	System.out.println("Get Ice Cream");
    	break;
    case "snowy":
    	System.out.println("Put gloves");
    	System.out.println("Go snowboarding");
    	break;
    default:
    	System.out.println("Stay home");
    	System.out.println("Watch movie");
    }
		
		
		
		
		
		
	}

}
