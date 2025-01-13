package throwsExample;

public class ThrowExample {
    public static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException("Age Must be Greater than 18 or equals");
        }
        else{
            System.out.println("Age is Valid ");
        }
    }

    public static void main(String[] args) {
        checkAge(13);
    }
}
