package ConstructorIntroWithTasks;

public class Speaker {
	String model;
	double weight;
	int year;

	//how to call /invoke method?
	//you mus have an object from that class; using your objcet u will be able to call
	// How to call a constructor?
	//u can call constuctor only when u create an object from clas;
	// constur are called always this <new> keyword
	//method is a function ,we can do cert actions
	//method are used to put multiple statemnets in one block,we create method to organize
	//our code better and increase the reusibility of the code.
	//f.e substring is a common action when using string.substring mehtod is created so we can
	//use over and over to cut certain string value
	//constructor are used to create an object.
	//they are not there for reusibility or to do certain action, they are used to set
	//initial state of an object
	public Speaker(String model) {
		this.model = model;
	}
   //this () is a current constructor, if we want to call neighbor constructor
	public Speaker(String model, int year) {// here we overload
	//	this(model);//this will call previous model(from above)not from instance var
		//(if we want to call)
		this.model = model;// here we pass
		this.year = year;
		this.volumeDown();// here we call object
	}

	public void volumeUp() {
		System.out.println(model + " is increasing the volume");
	}

	public void volumeDown() {
		System.out.println(model + "is decreasing the volume");
	}
}
