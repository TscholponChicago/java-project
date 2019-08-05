package selfStudy;

public class AddingSymbolToArray {

	public static void main(String[] args) {
		int arr[] = {12,324,54,654,65,78};
		String str = "[";
		for(int a = 0; a < arr.length; a++) {
			str+=arr[a]+" ";
		}
		System.out.print(str+"]");
	}

}
