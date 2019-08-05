package objectDataType;

public class ArrayMinNumber {

	public static void main(String[] args) {
        // find min and max num
     int [] arr =  {13,434,67,8,9,1,2};
     int min = arr[0];
    for(int a = 0; a < arr.length; a++) {
    	if(arr[a] < min) {
    		min = arr[a];
    	}
    }
    System.out.println(min);
	}

}
