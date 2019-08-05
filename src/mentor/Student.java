package mentor;

public class Student {

    public String name;
    public static String school ;
    public Student(){
        System.out.println("Hello I'm constructor");
    }

    static {
        System.out.println("Hi! I'm static initializer");
    }

    {
        System.out.println("I'm INSTANCE INITIALIZER");
    }

    public static void meth(){
        System.out.println("Hi Im static method");
    }

//    public void  meth2(){
//        System.out.println("Hi Im INSTANCE method");
//    }





}
