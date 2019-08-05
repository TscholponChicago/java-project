package exceptions;

public class Driver {
    private String name; private String location;
    private  int age;

    public String getName() {
        return name;
    }
  public void info(){
      System.out.println("Name: ");
      System.out.println("Age: ");
      System.out.println("Location: "+location);
  }
    public void setName(String name) throws Exception{
        if(name.trim().contains(" ")){
            throw new Exception("Miltiple words are not allowed");//exception is within the
        }
        this.name = name;
    }
    public void setAge(int age){      //here exception might happened or not
        if(age < 0 || age >120){
           RuntimeException r = new RuntimeException("Invalid age entered: "+age);//here we cfeate a problem
           throw r; //keyword throw r
        }
        this.age =age;
    }
    public int getAge(){
        return  age;
    }


    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
