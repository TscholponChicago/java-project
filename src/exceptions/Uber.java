package exceptions;

public class Uber {
    public static void main(String[] args)throws Exception {
        Driver driver1=new Driver();
       // driver1.setName("Chopa Chhh");
        try{
            driver1.setName("Chopa Book");
        }
        catch (RuntimeException e){
            System.out.println("Catch block from set name ");

        }
        try{
            driver1.setAge(-40);
        }
        catch (RuntimeException e){
            System.out.println("Catch block from age ");

        }
       // driver1.setAge(-40);// here we have an exception, and how to handle an axception?this way:
        driver1.info();
        //exceptions are regul casses,we can create an object from them,idea is throwing an exception,
        //the syntax of exception is is below:
        //each expertion has a putpose : Excep is a parent exception for all excep types,
        //RunTimeException is parent of all unchecked exceptions
        // NullPointerEx is an excdeption that is used for null pointer object

        StringIndexOutOfBoundsException s = new  StringIndexOutOfBoundsException();
        //we are goint to thrown an exception for setAge

    }
}
