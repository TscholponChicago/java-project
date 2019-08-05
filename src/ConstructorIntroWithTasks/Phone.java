package ConstructorIntroWithTasks;

public class Phone {
	boolean touchScreen;
	String model;
	String color;
	long phoneNumber;
	int memory;
	
	// task1: PART I) create a class phone, inst var touchscreen, model,color,phoneNum
	// create a constr that accepts 2 param, (model,color),and set to correspond
	// instan vars
	// overload the constr that accepts 4 param(model,color,memory,touchscreen)
	// set values and check memory
	// if given memory is negat value, print Invalid memory, and dont set memory
	// value
	// otherwise set value,
	
	//PART II
	// create a method text that accepts long(phone num)and string(text) and returns
	// boolean,check given num length and text body
	// 
	// print : textbody sent to given phoneNum if length is 10 and text body is not
	// empty
	// then return true
	// invalid phone num, or text body return false
	
	//PART III
	//cfreate method call that accepts long(phone num).Print Calling to phone num"
	//if phone num length is 10, print invalid phone num if otherwise
	
	//PART IV
	//write prog that asks user to provide infor abut phone.Ask model and color
	//through console and create phone object with given infor then ask from the user
	//to enter phone num to call and invoke call method
	
	
	
	public Phone(String model, String color) {//PART I
		this.model = model;
		this.color = color;
	}

	public Phone(String model, String color, int memory, boolean touchScreen) {//PART II
		this.model = model;//we could do: this(model,color);instead to have 2 lines
		this.color = color;
		this.touchScreen = touchScreen;
		if (memory > 0) {
           this.memory =memory;
		}else {
			System.out.println("Invalid memory");
		}
	}
	public boolean text(long phoneNumber,String text) {//PART III
		String pn = phoneNumber +"";//we convert phonunum to string
		if(pn.length() == 10 && !text.isEmpty()) {
			System.out.println(text+"sent to "+ phoneNumber);
			return true;
		}else {
			System.out.println("Invalid phone number or message");
			return false;
		}
	}
	public void call(long phoneNumber) {
		String pn = phoneNumber + "";
		if(pn.length() == 10) {
			System.out.println("Calling to "+ phoneNumber);
			
		}else {
			System.out.println("Invalid number");
			
		}
	}

}
