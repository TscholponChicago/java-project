package gurhanRevision;

public class CarApp {

    public static void main(String[] args) {
        Vehicle hatchBack = new Vehicle();
        hatchBack.year = 1994;
        hatchBack.brand="Subaru";
        hatchBack.model = "Legasy";
        hatchBack.miles=170000;
        hatchBack.price=4000;

        Vehicle suv= new Vehicle();
        suv.year = 1999;
        suv.miles=4404;
        suv.brand="Rose";
        suv.model="ponpon";
        suv.price=5000;

        Vehicle sedan = new Vehicle();
        sedan.model="kukushka";
        sedan.year=2000;
        sedan.miles=400000;
        sedan.price=30000;
        sedan.brand="modern";

        Vehicle truck =new Vehicle();
        truck.price=70000;
        truck.year=2000;
        truck.model="monster";
        truck.brand="lilia";
        truck.miles=90000;
        System.out.println("All vehicles");

        Vehicle [] arr = {hatchBack,truck,sedan,suv};
        for(int i=0; i < arr.length;i++) {
            System.out.println("-----------------------");

            System.out.println("Brand\t: " + arr[i].brand);
            System.out.println("Brand\t: " + arr[i].year);
            System.out.println("Brand\t: " + arr[i].miles);
            System.out.println("Brand\t: " + arr[i].model);
            System.out.println("Brand\t: " + arr[i].price);


        }
    }
}
