package Lab_8;

public class CheckingAccount {
    //Attributes
    private String accountNo;
    private float balance;

    //Operations
    //Default Constructor
    public CheckingAccount() {}

    public CheckingAccount(String accNo, float bal) {
        this.accountNo = accNo;
        this.balance = bal;
    }

    //Get
    public String getAccNo() { return this.accountNo; }

    public float getBalance() { return this.balance; }

    //Set
    public void deposit(float bal) {
        this.balance += bal;
        System.out.println("Your current balance is: $" + this.balance);
    }

    public void withdraw(float bal) {
        try {
            float finalBal = this.balance - bal;
            //The remaining balance should not be < 0
            if (finalBal < 0) { throw new InsufficientFundsException(finalBal); }
            this.balance -= bal;
            System.out.println("Your current balance is: $" + this.balance);
        }
        catch (InsufficientFundsException e) {
            System.out.println("Sorry, but your account is short by: $" + e.getAmount());
        }
    }
}
