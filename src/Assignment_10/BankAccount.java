package Assignment_10;

public class BankAccount {
    private int accNo;
    private double balance;

    public BankAccount(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposite(double amount){
        if(amount > 0){
            balance+=amount;
            System.out.println(amount+" is Deposity In your Account.");
        }else{
            System.out.println("Please Enter Possitve Number!");
        }
    }

    public void withdraw(double amount){
        try{
            if(amount > balance){
                throw new IllegalArgumentException("Insufficient balance.");
            }else{
                balance-=amount;
                System.out.println(amount+" Is Successfully Withdraw in Your Account");
            }
        }catch (IllegalArgumentException e){
            System.out.println("Exception :- "+e.getMessage());
        }
    }
    public void display(){
        System.out.println("Account Numbers :- "+accNo);
        System.out.println("Current Balance :- "+balance);
    }
}
