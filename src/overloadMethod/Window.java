package overloadMethod;

public class Window {

	public static void main(String[] args) {
	printArray(23,55,66);
	welcome("Cholpon");
	maxElement(23,66,12,89,44,908);
	}
	public static void printArray(int ... nums) {
		for(int a : nums) {
			System.out.println(a);
		}
	}
	public static void welcome(String name) {
		System.out.println("welcome:"+name);
	} 
	public static void maxElement( int ... num) {
		int max = num[0];
		for(int i : num) {
			if(i > max) {
				max = i;
			}
		}
		System.out.println("Max: "+ max);
	}

}
