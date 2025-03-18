public class Rhombus extends Shape {

    private double side; // attribute for the side of the rhombus
    private double height; // attribute for the height of the rhombus

    public Rhombus(String name, double side, double height) { // constructor where we can set the side and height
        super(name);
        this.side = side;
        this.height = height;
    }

    /*
    getters and setters for the side and height attributes
     */
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double area() { // implementation of the abstract method area from the Shape class
        return 0.0;
    }

    @Override
    public double perimeter() { // implementation of the abstract method perimeter from the Shape class
        return 0.0;
    }

    @Override
    public String toString() { // updated toString method to include the area and perimeter of the rhombus
        return super.toString() + "\nArea: " + area() + "\nPerimeter: " + perimeter();
    }
}
