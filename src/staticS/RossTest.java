package staticS;

public class RossTest {
    public static void main(String[] args) {
        RossStore r1 = new RossStore();
        r1.location = "Des Plaines";
        RossStore r2 = new RossStore();
        r2.location="Lincoln Square";
        RossStore r3 = new RossStore();
        r3.location = "Rosemont";
        System.out.println(r3.location);
        RossStore.numOfDress = 555;
       RossStore.bagBrands = "Chanell";


       r2.numOfSportShoes = 6000;
        System.out.println(RossStore.numOfSportShoes);
       RossStore.toysBrands = "Little People";
       r3.numOfToys = 600;
        System.out.println(RossStore.bagBrands);
        //System.out.println(RossStore.numOfBags);
        System.out.println(RossStore.numOfToys);
        RossStore.dishesBrands = "Pasha Bahche";
        r1.numOfDishes =888;
        r1.numOfBags =6000;
        r3.numOfDishes =453;
        System.out.println("-------------------------------------");
        RossStore.battelBrands = "Thermos";
        System.out.println(r1.battelBrands);
        r2.battelBrands = "Thermos1";
        System.out.println(r2.battelBrands);
        System.out.println("--------------------------------");
        r1.babySets = "Gerber";
        r2.babySets = "Tutuk";
        r1.numOfSets =1234;
        System.out.println(r1.numOfSets);
        System.out.println(r3.numOfSets);
        System.out.println(r1.babySets);
        System.out.println(r3.babySets);
        r2.sellBags();
        System.out.println(r2.numOfBags);
        r1.sellBags();
        System.out.println(r3.numOfBags);
        r3.sellToys();
        System.out.println(r1.numOfToys);
        RossStore rr = new RossStore();
        rr.sellDress();
        System.out.println(r1.numOfDress);
        System.out.println(RossStore.numOfDress);
    }
}
