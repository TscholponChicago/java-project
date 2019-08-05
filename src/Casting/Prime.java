package Casting;

public class Prime {

	public static void main(String[] args) {

      String s = "65.7";//it is not valid to Int, because first we need 
      ///to convert to int 
       int i = Integer.valueOf(s);
      System.out.println(i);
		
	//------------------------------
      String n = "767.7";
      double f = Double.valueOf(n);
      int o = (int)f;//this is explicit casting
		System.out.println(o);
		
	}

}
