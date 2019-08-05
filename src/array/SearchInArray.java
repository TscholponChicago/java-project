package array;

public class SearchInArray {

	public static void main(String[] args) {
		int nums[] = {34,66,77,7,21,345,77};
		int look = 77;
		boolean found = false;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == look) {
				System.out.println(look +" is found at index "+ i);
				found = true;
				break;
			}
		}
		if(!found) {
			System.out.println(look +" is not found");
		}
		
		String kitchen[] = {"Knife", "Spoon","Plate","Pot"};
		for(String item : kitchen) {
			item = item.toLowerCase();
			
		}
		
		
		
		
		
	}

}
