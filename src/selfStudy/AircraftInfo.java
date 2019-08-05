package selfStudy;

public class AircraftInfo {

	public static void main(String[] args) {
		
		Aircraft iak140 = new Aircraft();
		Aircraft iak80 = new Aircraft();
		iak140.passengers = 200;
		iak140.fuelBurnRate = 34.0;
		iak140.fuelCapacity = 40.0;
		
		iak80.passengers = 180;
		iak80.fuelBurnRate = 25.0;
		iak80.fuelCapacity = 30.0;
        double iak140Endurance = iak140.fuelCapacity / iak140.fuelBurnRate;
        System.out.println(iak140Endurance);
        
	}

}
