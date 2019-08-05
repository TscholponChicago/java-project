package selfStudy;

import java.util.Arrays;
import java.util.Scanner;

public class CreatingGroups {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter number of groups:");
	int size = scan.nextInt();
	scan.nextLine();
	String[][] groups = new String[size][];
	for(int a = 0; a < groups.length; a++ ) {
		System.out.println("Please enter number of student of group "+(a+1));
		int student = scan.nextInt();
		String[] group = new String[student];
		scan.nextLine();
		for(int b = 0; b < group.length;b++) {
			System.out.println("Please enter name"+(b+1));
			group[b] = scan.nextLine();
		}
		groups[a] = group;
	}
	System.out.println(Arrays.deepToString(groups));
}
}