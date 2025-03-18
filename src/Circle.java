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
        double area = Math.PI * Math.pow(radius, 2); // calculate the area of the circle
        area = Math.round(area * 100.0) / 100.0; // round the area to two decimal places
        return area; // return the area
    }

    @Override
    public double perimeter() { // implementation of the abstract method perimeter from the Shape class
        double perimeter = 2 * Math.PI * radius; // calculate the perimeter of the circle
        perimeter = Math.round(perimeter * 100.0) / 100.0; // round the perimeter to two decimal places
        return perimeter; // return the perimeter
    }

    @Override
    public String toString() { // updated toString method to include the area and perimeter of the circle
        return super.toString() + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
