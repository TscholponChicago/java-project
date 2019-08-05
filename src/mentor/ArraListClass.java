package mentor;

import java.util.ArrayList;

public class ArraListClass {
public static void main(String[] args) {
	ArrayList<String> newarr= new ArrayList<>();
	
	newarr.add("Adam");
	newarr.add("James");
	newarr.add("Pol");
	newarr.add(0, "Ulan");
//	System.out.println(newarr);
	
	newarr.set(2, "Cholpon");
	System.out.println(newarr);
	
	ArrayList<String> newarr1= new ArrayList<>();
	newarr1.add("Adam");
	newarr1.add("Cholpon");
	newarr1.add("Pol");
//	newarr1.add(0, "Ulan");
	System.out.println(newarr1);
	
	boolean b=newarr.equals(newarr1);
	System.out.println(b);
	
	
	
	System.out.println(newarr.indexOf("Adam"));
	
	
	
//	ArrayList<Integer>newint=new ArrayList<Integer>();
//	newint.add(10);
//	newint.add(20);
//	newint.add(30);
//	System.out.println(newint);
//	newint.set(1, 500);
//	System.out.println(newint);
	
	
	
}
}
