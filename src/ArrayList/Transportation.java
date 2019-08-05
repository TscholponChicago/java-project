package ArrayList;

import java.util.ArrayList;

public class Transportation {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
        System.out.println(names.size());
        names.add("Cholpon");
        names.add("Kate");
        System.out.println(names);
        names.add(1,"Tom");
        System.out.println(names);

        System.out.println(names.get(1));
        System.out.println(names.contains("Kate"));
        System.out.println(names.indexOf("Cholpon"));
        names.remove("Kate");
        System.out.println(names);
         
         
         
         
         
	}

}
