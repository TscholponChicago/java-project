package mentor;

import java.util.Arrays;

public class stringManip {

	public static void main(String[] args) {
		String a = "Hello cybertek today is saturday";
		int b =5;
		int len = a.length();
		System.out.println(b+"\t"+len);
		
		
		
		if(a.length() == b) {
			System.out.println("they are equal");
		}
		char first = a.charAt(0);
		char last = a.charAt(a.length()-1);
		System.out.println(first);
		System.out.println(last);
		
		if(first == last) {
			System.out.println("they are same");
		}else {
			System.out.println("not");
		}
		
	System.out.println("-----------------------------");
		
		
		String ss = "I have banana nand appli";
		
		char f = ss.charAt(0);
		char l = ss.charAt(ss.length() -1);
		String  dd = String.valueOf(f);//valueOf converts from prim to object string
		//
		String lastLet = String .valueOf(l);
	
		
		
		if(dd.equalsIgnoreCase(lastLet)) {
			System.out.println("ten");
		}
		
		System.out.println("_--CONVERTING STRING TO NUMBER------");
		
	   String ff = "10";
	   String nn = "5";
	   int k = Integer.parseInt(ff);
	   int jj = Integer.parseInt(nn);
	   int sum = k+jj;
	   System.out.println(sum);
	   
	   
	   String back  = String.valueOf(k);
	   String bbb = String.valueOf(jj);
	   String total = back+bbb;
	   System.out.println(total);
		
	   String tt = "Hello my friends and kids";
	   String [] arr  =tt.split(" ");
	   for(int i=0; i < arr.length;i++) {
		   System.out.print(arr[i]+" ");
	   }
	   
	   
	}

}
