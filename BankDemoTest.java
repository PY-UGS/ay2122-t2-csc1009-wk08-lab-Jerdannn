package Lab_8;
import java.util.Scanner;

public class BankDemoTest {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        CheckingAccount ca = new CheckingAccount("10101", 0);

        System.out.print("Please enter the amount you want to deposit: ");
        float userDeposit = userInput.nextFloat();
        ca.deposit(userDeposit);

        System.out.print("Please enter the amount you want to withdraw: ");
        float userWithdraw = userInput.nextFloat();
        ca.withdraw(userWithdraw);

        userInput.close();
    }
}
