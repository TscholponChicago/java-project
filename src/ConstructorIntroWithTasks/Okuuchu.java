package ConstructorIntroWithTasks;

public class Okuuchu {
    String name;
    String email;
    int age;
    public void read(){
        System.out.println(this.name+" is reading");
    }
    public void read(Kitep kitep){
        System.out.println(this.name+" is reading "+kitep.name+" by " + kitep.avtor);

    }
    public void read(int hours){
        System.out.println(this.name + " is reading for "+hours+" hours");
    }
}
