package MultiDimentionalArray;
import java.util.Arrays;
import java.util.Scanner;

public class CreatingGroups {

	public static void main(String[] args) {
//		String name = "Adam";
//		String [] n = new String[2];
//		n[0] = name;
//		String[][] nn = new String[2][];
//		nn[0] = n;
		//task 3:
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter size of groups:");
		int size = scan.nextInt();
		scan.nextLine();
		String [][] groups = new String[size][];
                
		for(int a = 0; a < groups.length; a++) {
			System.out.println("Please enter number of students for group "+(a + 1));
		    int students = scan.nextInt();
		    scan.nextLine();
		    String [] group = new String[students];
		    for(int b = 0; b < group.length; b++) {
		    	System.out.println("Please enter student's name "+(b+1)+":");
		        group[b] = scan.nextLine();
		    }
		    groups[a] = group;
		}
		System.out.println(Arrays.deepToString(groups));
		    
		
		
		
		
		
	}
	
	
}
