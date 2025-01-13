package Assignment_10;

public class Student {
    private int stdId;
    private String stdname;
    private int age;

    public Student(int stdId, String stdname, int age) {
        this.stdId = stdId;
        this.stdname = stdname;

    }
    public void studentage(int age){
        if (age < 5 || age > 100){
            throw new IllegalArgumentException("Age should be 5 to 100");
        }
        this.age = age;
    }
    void display(){
        System.out.println("Student Id :- "+stdId);
        System.out.println("Student Name :- "+stdname);
        System.out.println("Student Age:- "+age);
    }

}
