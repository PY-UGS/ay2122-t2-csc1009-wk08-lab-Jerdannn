package Lab_8;
import java.lang.Math;

public class InsufficientFundsException extends Exception {
    //Attributes
    private double amount;

    //Operations
    //Default Constructor
    public InsufficientFundsException() {}

    public InsufficientFundsException(double amount) {
        this.amount = Math.abs(amount);
    }

    //Get
    public double getAmount() { return this.amount; }
}
