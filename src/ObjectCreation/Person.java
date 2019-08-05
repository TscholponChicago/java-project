package ObjectCreation;

public class Person {
	String name;//instance var(it is null )
	int age;//instance var(int is 0)
	String gender;//it is null now
   //the name that is declared within method is called local var
	//name that is declared inside the class is called instance var(this belongs to an object)
	// when using variables java accepts local var as priority
	
	public void talk() {
        String name = "Ulanbek";// name ==> local var
        System.out.println(name);//local var has priority
        // to call instance var we use this. method, syoutt(this.age) or (this.gender)
        //we use this to refer to the current object of its type
        //it behaves just like an objcet from the class type
	}

}
