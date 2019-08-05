package ObjectCreation;

public class AnimalShop {

	public static void main(String[] args) {
		Animal an1= new Animal();
//		an1.type = "Elephant";
//		an1.age= 2;
//		an1.color="grey";
		
		an1.setValues("dog", "grey", 3, 2);
		an1.info();
		
		Animal a2= new Animal();
		a2.setValues("bird", "purple", 8, 6);
		a2.info();
		Animal a3= new Animal();
		a3.setValues("dragon", "black", 77, 100000);
		a3.info();
		
		
	}

}
