package Lab_8;

public class InsufficientFundsException extends Exception {
    //Attributes
    private double amount;

    //Operations
    //Default Constructor
    public InsufficientFundsException() {}

    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }

    //Get
    public double getAmount() { return this.amount; }
}
