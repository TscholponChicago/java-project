package ConstructorIntroWithTasks;

public class Const1 {
    String name;
    String school;
    int age;
    public Const1(){
        System.out.println("empty constructor");
    }
    public Const1(String name){
        System.out.println("1 arg constructor");
    }
    public Const1(String name, int age){
        System.out.println("Every student has name and age.");
    }
}
