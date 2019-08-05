package povtoreniePropushennihTem;

public class Car {
    String model;
    int year;
    boolean sportEdition;
    int mileage;
    public void drive(){
        System.out.println(year + ","+ model+" is driving. ");
        mileage +=10;
    }
    public void drive(String destination){
        System.out.println(year +" ," +model+" is driving to "+ destination);
    }
    public void drive(int mile){
        System.out.println(year+ model+ " is driving "+mileage +" miles.");
        mileage +=3;
    }
}
