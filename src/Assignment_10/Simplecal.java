package Assignment_10;

public class Simplecal {
    int add(int a,int b){
        return a+b;
    }
    int sub(int a,int b){
        return a-b;
    }
    int mul(int a,int b){
        return a*b;
    }
    int div(int a,int b) {
        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
        } catch (ArithmeticException e) {
            System.out.println("Exception :- " + e.getMessage());
        }
        return a/b;
    }
}
