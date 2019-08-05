package povtoreniePropushennihTem;

public class AppleBazaar {
    public static void main(String[] args) {
        Apples a1= new Apples();
        a1.type ="Golden";
        a1.color="red";
        a1.size=2;
        a1.taste="sweet";
        a1.info();
        Apples a2 =new Apples();
        a2.color="green";
        a2.size=4;
        a2.info();
        //instead of doing info above we can just do like below:
        a1.setValues(3,"yellow","red","sour");
        a1.info();
    }
}
