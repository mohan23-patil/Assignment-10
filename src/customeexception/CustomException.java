package customeexception;

public class CustomException {
    private double balance;

    public CustomException(double balance) {
        this.balance = balance;
    }

    public void withdrow(double amount) throws InsufficentFundsException{
        if(amount > balance){
            throw new InsufficentFundsException("Insufficient Funds. your amount "+amount+" and Avalible balance is only :- "+balance);
        }
        balance -= amount;
        System.out.println("Withdraw SuccessFully and Available Banalce is :- "+balance);
    }

    public static void main(String[] args) {
        CustomException account = new CustomException(1000.0);

        try{
            account.withdrow(500.0);
            account.withdrow(400.0);
            account.withdrow(300.0);
        }catch (InsufficentFundsException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Transaction Successfully Complate.");
    }
}
