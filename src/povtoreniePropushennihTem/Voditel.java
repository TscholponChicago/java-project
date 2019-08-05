package povtoreniePropushennihTem;

public class Voditel {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.model="honda";
        car1.sportEdition=true;
        car1.year=2017;
        car1.mileage=20000;
        System.out.println(car1.mileage);
        car1.drive();
        car1.drive(23);
        car1.drive("Ohio");
    }

}
