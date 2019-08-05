package mentor;
public class PenFactory {
    String name;
    int age;

    public static void main(String[] args) {

        Pen p1=new Pen("red",5);
        p1.write();
        System.out.println(p1.getAge());
        System.out.println(p1.getName());

        p1.setAge(2);
        p1.setColor("Green");

        System.out.println(p1.getAge());
        System.out.println(p1.getName());
        p1.getName();
        p1.getAge();
        String n = "Cholpon";
        String res=n.substring(2);
        System.out.println(res);


    }
}
