package povtoreniePropushennihTem;

public class PetShop {
    public static void main(String[] args) {
        Dog dog1= new Dog();
        //instatnciation --> ceating an objects, wheneb=ver we use new keyword so we crate an objcet
        dog1.age =8;
        System.out.println(dog1.age);
        System.out.println(dog1.breed);
        dog1.bark();
        Dog dog2 = new Dog();
        dog2.age=7;

    }
}
