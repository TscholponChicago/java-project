package objectDataType;

public class Uhren {

	public static void main(String[] args) {
		
		watch w1 = new watch();
		w1.brand = "swatch";
		w1.style = "modern";
		w1.price = 200.33;
	    w1.info();
	    w1.tick();
	    watch w2 = new watch();
	    w2.brand = "fossil";
	    w2.price = 334.45;
	    w2.style = "halola";
	    w2.showDate();
	    w1.showDate();
	    double total = w1.price + w2.price;
	    System.out.println(total);
	    
	}

}
class watch{
	String brand,style;
	double price;
  void  info() {
		System.out.println("Each watch shows time.");
		
	}
  void showDate() {
	  System.out.println(brand+" "+" Watch show the date");
  }
  void tick() {
	  System.out.println("Watch can tick");
  }
}
