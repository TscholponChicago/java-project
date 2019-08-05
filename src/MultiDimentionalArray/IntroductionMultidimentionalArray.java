package MultiDimentionalArray;

import java.util.Arrays;

public class IntroductionMultidimentionalArray {

	public static void main(String[] args) {
		// syntax : int [][] nums = 
		String [] [] groups = new String[3][];
		//task create 3 string arrays - 3 groups
		//1st array size of 2, 2nd array size of 5, 3rd size of 4
		//give names for all elements
		String [] team3 = {"Adam","tom"};
		String [] team2= {"Vildan","Ulan","Roma","Kate","Ulugbek"};
		String [] team1 = {"Cholpon","Yaseen","roma","bilal"};
		
//		groups[0] = team1;
//		groups[1] = team2;
//		groups[2] = team3; 
		
		// groups[1] [3]--> gives team2 value kate
		System.out.println(groups[1][3]); // [1] is a name of array [3] value under index position
		System.out.println(groups[1][3].charAt(0));// gives the first letter of Kate it is K
		
		
		// task: print adam and yaseen
		System.out.println(groups[2][0]);
		System.out.println(groups[0][1]);
		
		
		// it is same like
		//int age1 = 34;
		//int age2 = 44;
		// int [] ages = new int [2];
		//ages[0] = age1;
		//age[1] = age2;
		
		
		//print members from 1 array
		System.out.println(Arrays.toString(team2));
		
		
		//print all teams using Arrays toString method
		// team1 ==> groups[0]  team2==> group[1]
		System.out.println(Arrays.toString(groups[0]));
		System.out.println(Arrays.toString(groups[1]));
		System.out.println(Arrays.toString(groups[2]));
		
		System.out.println();
		//print each team members using arrays tostringMeth using loop
	//	System.out.println(groups.length);// it represents outer array
		for(int a = 0; a < groups.length; a++) {
			for(int b = 0; b < groups[a].length; b++) {
				System.out.println(groups[a][b]);
				
			}
			System.out.println("------------------------");
			//System.out.println(Arrays.toString(groups[a]));
			//task : to print size of each inner array
			//System.out.println(groups[a].length);// gives a size of each inner array
		}
	}

}
