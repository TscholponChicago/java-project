package povtoreniePropushennihTem;

public class Apples {
    String type;
    int size;
    String color;
    String taste;

//    public void setValues(int sizeValue,String typeValue, String colorValue,String tasteValue){
//        size = sizeValue;
//        type = typeValue;
//        color=colorValue;
//        taste = tasteValue;
//    }
    //instead to do like above we can do like below to use "this" keyword
    public void setValues(int size,String type, String color,String taste){
        this.size= size;
        this.color=color;
        this.taste=taste;
        this.type=type;
    }
   public void info(){
       if(size !=0){
           System.out.println("Size: "+size);
       }if(color != null){
           System.out.println("Color: "+color);
       }if(taste != null){
           System.out.println("Taste: "+taste);
       }if(type!= null){
           System.out.println("Type: "+type);
       }





   }


}
