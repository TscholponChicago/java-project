package mentor;

public class Pen {
    private String name;
   private  int age;
    public Pen(String name,int age){
        this.name = name;
        this.age=age;
    }
   public void write(){
       System.out.println("PEn is writing");
   }
   public void  setColor(String name){
        this.name=name;
   }
   public void setAge(int age){
        this.age=age;
   }
   public String getName(){
        return name;
   }
   public int getAge(){
        return age;
   }
}
