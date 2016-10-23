/**
 * Created by Christian on 10/16/2016.
 */
public class Rectangle {
    private double height = 1;
    private double width = 1;

    //Constructor
    public Rectangle(){
        this.height = height;
        this.width = width;
    }

    //Overloaded Constructor
    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    //Setters and Getters
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    //ToString
    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }

    // Additional Methods
    public double getArea(){
        double area;
        area = width * height;
        return area;
    }

    public double getPerimeter(){
        double perimeter;
        perimeter = (2 * width) + (2* height);
        return perimeter;
    }
}
