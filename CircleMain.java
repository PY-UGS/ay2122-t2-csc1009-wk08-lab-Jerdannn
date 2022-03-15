package Lab_8;
import java.util.Scanner;

public class CircleMain {
    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner(System.in);
            System.out.print("Please enter a radius: ");
            double userRadius = userInput.nextDouble();
            CircleWithException c = new CircleWithException(userRadius);
            double userArea = c.getArea();
            userInput.close();

            //Radius needs to be >= 0
            if (userRadius <= 0) {
                throw new IllegalArgumentException();
            }
            //Area needs to be <= 1000
            if (userArea > 1000) { 
                throw new Exception(); 
            }

            double userDiameter = c.getDiameter();
            System.out.println("Radius: " + userRadius);
            System.out.println("Area: " + userArea);
            System.out.println("Diameter: " + userDiameter);
        }
        //Catch the IllegalArgumentException thrown
        catch (IllegalArgumentException e) {
            System.out.println("Radius should be greater than 0");
        }
        //Catch the Exception thrown
        catch (Exception e) {
            System.out.println("Area shouldn't be greater than 1000");
        }
    }
}
