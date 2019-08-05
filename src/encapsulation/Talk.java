package encapsulation;

import java.util.ArrayList;

public class Talk {

	public static void main(String[] args) {
//    IPhone i = new IPhone();
//    i.setMemory(234);
//    //i.model = "XS";
//   // i.memory = 164;
//    i.info();
//        System.out.println(i.getMemory());
        Person p1 = new Person();
        p1.setName("Cholpon");
        p1.setAge(39);
        System.out.println(p1.getAge());
        System.out.println(p1.getName());
        p1.setGender("male");
        Person.getHaircut(p1);





	}

    }


