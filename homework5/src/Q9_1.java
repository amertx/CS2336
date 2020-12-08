import java.util.*;

public class Q9_1 {

    public static void main(String[] args) {
        // write your code here
        Rectangle rectangle1 = new Rectangle(4, 40);
        //System.out.println("Rectangle 1 details: ");
        System.out.println("Width: " + rectangle1.width + " " + "Height: " + rectangle1.height + " " + "Area: " + rectangle1.getArea()
        + " " + "Perimeter: " + rectangle1.getPerimeter());

        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        //System.out.println("Rectangle 1 details: ");
        System.out.println("Width: " + rectangle2.width + " " + "Height: " + rectangle2.height + " " + "Area: " + rectangle2.getArea()
                + " " + "Perimeter: " + rectangle2.getPerimeter());

    }
}

class Rectangle{
    double width = 1;
    double height = 1;

    Rectangle(){

    }

    Rectangle(double newWidth, double newHeight){
        width = newWidth;
        height = newHeight;
    }

    double getArea(){
        return width * height;
    }

    double getPerimeter(){
        return ((2*width) + (2*height));
    }





}
