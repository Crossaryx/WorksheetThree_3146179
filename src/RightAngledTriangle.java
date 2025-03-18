public class RightAngledTriangle extends Shape {

    private double leg1; // attribute for the one of the non-hypotenuse sides of the right-angled triangle
    private double leg2; // attribute for the other non-hypotenuse side of the right-angled triangle

    public RightAngledTriangle(String name, double base, double height) { // constructor where we can set the legs of the right triangle
        super(name);
        this.leg1 = base;
        this.leg2 = height;
    }

    /*
    getters and setters for the base and height attributes
     */
    public double getLeg1() {
        return leg1;
    }

    public void setLeg1(double leg1) {
        this.leg1 = leg1;
    }

    public double getLeg2() {
        return leg2;
    }

    public void setLeg2(double leg2) {
        this.leg2 = leg2;
    }

    @Override
    public double area() { // implementation of the abstract method area from the Shape class
        return leg1 * leg2 / 2;
    }

    @Override
    public double perimeter() { // implementation of the abstract method perimeter from the Shape class
        return leg1 + leg2 + Math.sqrt(leg1 * leg1 + leg2 * leg2);
    }

    @Override
    public String toString() { // updated toString method to include the area and perimeter of the right-angled triangle
        return super.toString() + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
