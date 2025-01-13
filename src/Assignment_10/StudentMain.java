package Assignment_10;

public class StudentMain {
    public static void main(String[] args) {
        try{
            Student str = new Student(101,"Mohan",24);
            Student str1 = new Student(102,"Sachin",20);

            str.studentage(35);
            str.display();

            //For Student two Exception.
            str1.studentage(200);
            str1.display();

        }catch (IllegalArgumentException e){
            System.out.println("Exception Is Occuped: "+e.getMessage());
        }
        System.out.println("THe code End ");
    }
}
