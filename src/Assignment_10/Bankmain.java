package Assignment_10;

public class Bankmain {
    public static void main(String[] args) {
        BankAccount obj = new BankAccount(123456789,1000.0);
        System.out.println("\n*** Account Details ***");
        obj.display();

        System.out.println("\n***Deposite Details***");
        obj.deposite(200.0);
        obj.display();

        obj.deposite(500.0);
        obj.display();

        System.out.println("\n***Withdraw Details***");
        obj.withdraw(100.0);
        obj.display();

        obj.withdraw(500.0);
        obj.display();

        obj.withdraw(10000.0);//exception occur.




    }
}
