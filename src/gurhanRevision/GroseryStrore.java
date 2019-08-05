package gurhanRevision;

public class GroseryStrore {
    public static void main(String[] args) {


    Yabloki apple1= new Yabloki(5,"red","sweet",2);
    Yabloki apple2 = new Yabloki(3,"green","sour",4);
    Yabloki apple3 = new Yabloki(4,"yellow","normal",2);

    Yabloki[] applesAr = {apple1,apple2,apple3};
    System.out.println("your apples specs are:");
    for(int j=0; j < applesAr.length; j++){


            System.out.println("-------------------");
            System.out.println("Apple: " + applesAr[j].weight);
            System.out.println("Color: " + applesAr[j].color);
            System.out.println("Taste: " + applesAr[j].taste);
            System.out.println("Size: " + applesAr[j].size);

        }
    }
}
