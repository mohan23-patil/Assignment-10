package throwsExample;

public class ThrowsExample {
    public static void riskmethod() throws ArithmeticException{
        int a = 10/0;
        System.out.println("The Result Is :- "+a);
    }

    public static void main(String[] args) {
        try{
            riskmethod();
        }catch (ArithmeticException e){
            System.out.println("Exception Is occured :- "+e.getMessage());
        }
        System.out.println("The Program Has been Complete");
    }
}
