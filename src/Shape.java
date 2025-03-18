public abstract class Shape { // base abstract class for all shapes
    private String name; //

    public Shape(String name) {
        this.name = name;
    } // constructor to set the name of the shape

    public String getName() {
        return name;
    } // getter for the name attribute

    public void setName(String name) {
        this.name = name;
    } // setter for the name attribute

    public abstract double area(); // blueprint for the area method

    public abstract double perimeter(); // blueprint for the perimeter method

    @Override
    public String toString() {
        return "Shape: " + name;
    } // overridden toString method to include the name of the shape

}
