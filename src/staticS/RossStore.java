package staticS;

public class RossStore {
    String location;
    public int numOfBags;
    static String bagBrands;
    public String dressBrands;
    static int numOfDress;
    static String toysBrands;
    static int numOfToys;
    private  String sportShoese;
    static int numOfSportShoes;
    static String dishesBrands;
    static int numOfDishes;
    static String battelBrands;
    static int numOfBottles;
    static String babySets;
    static int numOfSets;
    public void sellBags(){
        System.out.println("Bag is sold");
        numOfBags--;
    }
    public void sellToys(){
        System.out.println("Toy is sold");
        numOfToys--;
    }
    public void sellDress(){
        System.out.println("Dress is sold");
        numOfDress--;
    }
    static String day = "Monday";
    static{
        if(day.equals("Saturday")){
            numOfDress=45;
        }else{
            numOfDress=89;
        }

    }
}
