public class Circle extends Shape {

    private double radius; // attribute for the radius of the circle

    public Circle(String name, double radius) { // constructor where we can set the radius
        super(name);
        this.radius = radius;
    }

    /*
    getters and setters for the radius attribute
     */
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() { // implementation of the abstract method area from the Shape class
        return 0;
    }

    @Override
    public double perimeter() { // implementation of the abstract method perimeter from the Shape class
        return 0;
    }

    @Override
    public String toString() { // updated toString method to include the area and perimeter of the circle
        return super.toString() + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
