package staticS;

import java.util.ArrayList;

import utilities.MyCollection;

public class CarDealer {

	public static void main(String[] args) {
		System.out.println(Lexus.totalLexus);
        Lexus l1=new Lexus("Es 350",2019);
       System.out.println(Lexus.totalLexus);
       System.out.println(Lexus.mileToKm(13));
        l1.mileage =17000;
        System.out.println(l1.mileage);
        Lexus.evaluateCar(l1);
        Lexus l2= new Lexus("ER Selena",2015);
        l2.mileage = 120000;
        Lexus.evaluateCar( l2);
        Lexus l3 =new Lexus("Selenium 1223",2006);
        l3.mileage = 2000000;
        Lexus.evaluateCar(l3);
        Lexus l4=new Lexus("Rooooom",2003);
        l4.mileage = 100000;
        Lexus.evaluateCar(l4);
        ArrayList<String> myList = MyCollection.getStringList();//we catched those words
        System.out.println(myList);
	}

}
