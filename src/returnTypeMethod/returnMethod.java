package returnTypeMethod;

public class returnMethod {

	public static void main(String[] args) {

     //return type methods in java:method can be created and return single value bach to user
		//when creating a method, we have to specify the data type, 
		//we will be returning in the method signature
		// method signature is public static void m(){  here we specify data type
		//we will replace keyword 'void' to another datatyoe.Specified datatype must be returned from
		//this method
		// public static int m(){
		//   return 45; if we put it so it will not complane
		//}  
		//this will complane , we must use keyword return and pass value that matches to the specified return datatype
		//
		int s = getMemory();//this will give just returning the comp memory
		System.out.println(s);
	}
	public static int getMemory() {
		System.out.println("Returning the comp memory");
		return 43;// since we put return it will not complane
	}
	

}
