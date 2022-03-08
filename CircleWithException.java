package Lab_8;

public class CircleWithException {
    //Constants
    static final double PI = 3.14159265359;
    //Attributes
    private double radius;

    //Operations
    //Default Constructor
    public CircleWithException() {}

    public CircleWithException(double rad) {
        this.radius = rad;
    }

    //Get
    public double getRadius() { return this.radius; }

    //Set
    public void setRadius(double rad) { this.radius = rad; }

    //Misc.
    //Get the area of the circle
    public double getArea() {
        return (PI * this.radius * this.radius);
    }

    //Get the diameter of the circle
    public double getDiameter() {
        return (2 * this.radius);
    }
}
