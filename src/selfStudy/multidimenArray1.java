package selfStudy;

import java.util.Arrays;

public class multidimenArray1 {

	public static void main(String[] args) {
		String[][] countries = new String[2][];
		String[] country1 = {"India","Russia","Moldova"};
		String[]country2 = {"Kyrgyzstan","Uzbekisatn","Tadjikistan","China"};
		countries[0] = country1;
		countries[1] = country2;
		System.out.println(countries.length);
		System.out.println(country1.length);
		System.out.println(country2.length);
		System.out.println(countries[0][1]);
		System.out.println(countries[0][2]);
		System.out.println(countries[1][0]);
		System.out.println(country1[0]);
		System.out.println(countries[0][0]);
		System.out.println(Arrays.toString(countries[0]));
		System.out.println(Arrays.toString(country1));
		for(int a = 0; a < countries.length;a++) {
			for(int b = 0; b < countries[a].length;b++) {
				System.out.println(countries[a][b]);
			}
		}
		String [][] names = new String[3][];
		String[] name1 = {"Cholpon","Chinara","Chikita"};
		String[] name2 = {"Roma","Rita","Rose"};
		
		 names[0] = name1;
		 names[1] = name2;
		 System.out.println(names[0][0]);
		 for(int i = 0; i <names.length;i++) {
			 for(int j = 0; j < names[i].length; j++) {
				 System.out.println(names[i][j]);
			 }
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
