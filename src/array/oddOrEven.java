package array;

public class oddOrEven {

	public static void main(String[] args) {
      // create var and assign values, calculate sum and print, plus cal
	// even and odd
		int sum = 0;
		int even = 0; int odd = 0;
		
		int nums [] = {34,66,77,88,99};
		for(int a : nums) {
			sum += a;
			if( a % 2 == 0) {
				even +=a;
			}else {
				odd+= a;
			}
		}
 System.out.println("Sum is:"+ sum);
		System.out.println("Even:"+even);
		System.out.println("Odd:"+odd);
		
		
	}

}
