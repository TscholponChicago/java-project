package encapsulation;

public class IPhone {
	private String model;
	private int memory;
	public int getMemory(){
		this.memory = memory;
		return this.memory;
	}
	public void setMemory(int memory){

		if(memory >=128){
			this.memory = memory;
		}else{
			System.out.println("Invalid memory");
		}
	}
	public void info(){
		System.out.println("Model :"+this.model);
		System.out.println("Memory: "+this.memory);
	}
	
	


}
