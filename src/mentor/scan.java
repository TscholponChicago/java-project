package mentor;

import java.util.Scanner;

public class scan {

	public static void main(String[] args) {
		Scanner  scan = new Scanner(System.in);
		System.out.println("Pls enter full name:");
		String fullName = scan.nextLine();
		int index = fullName.indexOf(" ");
		String beg = fullName.substring(0,index);
		String last = fullName.substring(index+1);
//		//System.out.println(beg + " "+ last);
//		System.out.println(beg);
//		System.out.println(last);
//		String str = "Cybertek,Avangers";
//        int ind = str.indexOf(",");
//        String str2 = str.substring(0,ind);
//        String str3 = str.substring(ind+1);
//        System.out.println(str2);
//        System.out.println(str3);
//        String words = "I sleep";
//        int i = words.indexOf(" ");
//        String a = words.substring(0,1);
//        String b = words.substring(i+1);
//        System.out.println(a);
//        System.out.println(b);
//		  System.out.println("Enter 4 words separeted by space: ");
//		  String w  = scan.nextLine();
//		  int indexOf2Space = w.indexOf(" ",w.indexOf(" ")+1);
//		  System.out.println(indexOf2Space);
//		  String w1 = w.substring(0,w.indexOf(" "));
//		  String w2 = w.substring(w.indexOf(" ")+1,indexOf2Space);
//		  String w3 = w.substring(w.indexOf2Space(" ")+1,indexOf2Space);
		  String nameChar = fullName.substring(0,1);
		  String lastNameChar = fullName.substring(index+1);
		 if(nameChar.equals(nameChar.toLowerCase())) {
			 fullName = nameChar.toUpperCase() + fullName.substring(1);
		 }if(lastNameChar.contentEquals(lastNameChar.toLowerCase())) {
			 last = lastNameChar.toUpperCase()+last.substring(1);
		 }
		 System.out.println(beg+"\n"+last);
		
        
	}
	

}
