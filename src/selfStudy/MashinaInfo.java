package selfStudy;

public class MashinaInfo {

	public static void main(String[] args) {

		Mashina m1 = new Mashina();
		m1.brand = "Honda";
		m1.mileage = 20000;
		m1.sportEdit = true;
		m1.year = 2019;

		m1.drive();
		System.out.println(m1.mileage);
		m1.drive(200);
		System.out.println(m1.mileage);
		m1.drive("Aurora");
		System.out.println(m1.mileage);

	}

}
