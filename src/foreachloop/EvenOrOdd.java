package foreachloop;

public class EvenOrOdd {

	public static void main(String[] args) {
		 String[] favorFruits = {"Apple","Kiwi","Banana","Mango","Pineapple"};
		 //TASK print fruit if length of the fruit is even
		 for(String fruit : favorFruits) {
			 if(fruit.length() % 2 == 0) {
				 System.out.println(fruit);
			 }
		 }
		 
		 String city[] = {"boston","bishkek","tashkent","baku"};
		 for(String cities : city){
			 if(cities.length() % 2 == 0) {
				 System.out.println(cities);
			 }
		 }
		  String animals[] = {"orangutang","giraffe","dog","rooster","cat","tiger","polar bear"};
		  for(String animal : animals) {
			  if(animal.length() % 2 == 0) {
				  System.out.println(animal);
			  }
		  }
		  
	}

}
