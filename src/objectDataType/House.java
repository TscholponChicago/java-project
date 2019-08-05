package objectDataType;

public class House {
   String type;
   String address;
   int numRooms;
   
   public void info() {
	   System.out.println("my house is "+ type + ". And my address is : "+ address + " . There are just "+ numRooms +" rooms");
	   
	   
   }
	
	public void infor(String type, String address, int numRooms) {
		this.type = type;
		this.address = address;
		this.numRooms = numRooms;
	}
}
