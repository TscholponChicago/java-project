package selfStudy;

public class StudentenInfor {

	public static void main(String[] args) {
		
		Studenten st1 = new Studenten();
		st1.name = "Cholpon";
		st1.lastName = "Mashieva";
		st1.age = 39;
		st1.id = 123456789;
		st1.status = "marriage";
		st1.kids = 3;
		//st1.hobby = "reading and music";
		st1.genInfo();
		
		System.out.println();
		
		Studenten st2 = new Studenten();
		st2.name = "Ulanbek";
		st2.lastName = "Azimbaev";
		st2.age = 41;
		st2.kids = 3;
		st2.status = "marriage";
		//st2.hobby = "reading and volonteering";
		st2.genInfo();
		
		st1.famStatus();
		st1.interest("reading and music");
		
		System.out.println();
		st2.famStatus();
		st2.interest("reading and volonteering");
		System.out.println();
		st1.friends(25);
		st2.friends(40);
		System.out.println();
		st1.cars(1);
		st2.cars(1);
		System.out.println();
		st1.books(30);
		st2.books( 50);
		
		
		
		
		
		
	}

}
