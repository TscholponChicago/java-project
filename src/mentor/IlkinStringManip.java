package mentor;

public class IlkinStringManip {

	public static void main(String[] args) {
      
		String str2 = "apple";
		String str1= "apple";
		System.out.println(str2.equals(str1));
		System.out.println();
		System.out.println(str2.equals("dsf"));
		
		
		
		
		
		
		
		
        String name = "Cholpon";
        String name1 = "Cholpon";
        String name2 = "Hanna";
        String name3 = "yaseen";
        System.out.println(name.compareTo(name1));
        System.out.println(name.compareTo(name3));
        System.out.println(name1.contentEquals(name3));
        System.out.println(name2.contains("nn"));
        System.out.println(name3.contains("z"));
        System.out.println(name.endsWith("n"));
        System.out.println(name.endsWith("z"));
        System.out.println(name.startsWith("c"));
        String country = "Kyrgyzstan";
        System.out.println(country.substring(0));
        System.out.println(country.substring(3));
        System.out.println(country.substring(0,3));
        System.out.println(country.substring(2,5));
        System.out.println(country.substring(2,8));
        System.out.println(name.replace('o', 'u'));
        String str = "I have dolls and books.I have banana and apples.";
        System.out.println(str.replaceAll("a","u"));
        System.out.println(str.replaceAll("have", "had"));
        String color = "Cholpon Mashieva Askaralievna";
        System.out.println(color.trim());
	}

}
