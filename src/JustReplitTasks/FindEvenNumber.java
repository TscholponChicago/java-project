package JustReplitTasks;

public class FindEvenNumber {

	public static void main(String[] args) {
		int sumEven = 0;
		int [] nums = {2,1,2,3,4};
		int [] nums1 = {2,2,0,3,5};
		int [] nums2 = {1,3,5,7,9};
		for(int a = 0; a < nums.length; a++) {
			if(nums[a] % 2 == 0) {
				sumEven ++;
			}
		}
        System.out.println(sumEven);
	}

}
