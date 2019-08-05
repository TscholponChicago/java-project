package ConstructorIntroWithTasks;

public class Mektep {
    public static void main(String[] args) {
        Okuuchu o1= new Okuuchu();
        o1.name = "Hanna";
        o1.email="sdg@lsddv";
        o1.age=8;
        o1.read();

        Kitep kitep=new Kitep("kopolok");
        kitep.avtor="Chingiz Aitmatov";
        kitep.name="Gulsaary";
        kitep.pages=230;
        o1.read(kitep);
        o1.read(2);
    }
}
