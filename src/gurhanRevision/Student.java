package gurhanRevision;

public class Student {
    String firstName,lastName;//belong to objcet
    static int studentCount;//it belongs to class inself, ,it doestnot belong to objcet,if we want to use so Student.studentCount

    public  Student(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        studentCount++;
        System.out.println("Added student :"+firstName + " "+lastName);
        System.out.println("Number of student: "+studentCount);
       // System.out.println("Added student: "+);



    }
}
