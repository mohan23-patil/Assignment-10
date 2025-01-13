package Assignment_10;

public class CalculatorMain {
    public static void main(String[] args) {
        Simplecal obj = new Simplecal();

        System.out.println("Addition is :- "+obj.add(20,10));
        System.out.println("Subtraction Is :- "+obj.sub(20,1));
        System.out.println("Multiplication Is :- "+obj.mul(20,10));
        System.out.println("Division Is :- "+obj.div(10,0));
    }
}
