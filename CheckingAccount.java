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
        try {
            float startBal = bal;
            //The depositing amount should not be <= 0
            if (startBal <= 0) { throw new InsufficientFundsException(); }
            //Done after the exception handling
            this.balance += bal;
            System.out.println("Your current balance is: $" + this.balance);
        }
        catch (InsufficientFundsException e) {
            System.out.println("You cannot deposit an amount less than 0");
        }
    }

    public void withdraw(float bal) {
        try {
            float finalBal = this.balance - bal;
            //The remaining balance should not be < 0
            if (finalBal < 0) { throw new InsufficientFundsException(finalBal); }
            //Done after the exception handling
            this.balance -= bal;
            System.out.println("Your current balance is: $" + this.balance);
        }
        catch (InsufficientFundsException e) {
            System.out.println("Sorry, but your account is short by: $" + e.getAmount());
        }
    }
}
