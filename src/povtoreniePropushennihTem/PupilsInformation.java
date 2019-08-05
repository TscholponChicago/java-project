package povtoreniePropushennihTem;

public class PupilsInformation {
    public static void main(String[] args) {
        Pupils p1 = new Pupils();
        p1.name ="Malika";
        p1.lastName="Kochkorova";
        p1.age=33;
        p1.gender ="female";

        Pupils p2=new Pupils();
        p2.name = "Chikita";
        p2.lastName="Tumanova";
        p2.age=35;
        p2.gender="female";

        Pupils p3= new Pupils();
        p3.name="Bakit";
        p3.lastName="Toktorov";
        p3.gender="male";
        p3.age=25;

        Pupils [] students  = new Pupils[3];
        students[0] = p1;
        students[1] = p2;
        students[2] = p3;
        for(Pupils p: students){
            System.out.println(p.name);
        }
    }
}
