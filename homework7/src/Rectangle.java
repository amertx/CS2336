public class Rectangle extends GeometricObject implements Comparable{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /** Return width */
    public double getWidth() {
        return width;
    }

    /** Set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /** Return height */
    public double getHeight() {
        return height;
    }

    /** Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }

    @Override /** Return area */
    public double getArea() {
        return width * height;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
    }

    //from comparable interface
    @Override
    public int compareTo(Object obj) {
        Rectangle r1 = (Rectangle) obj;

        if(r1.equals(obj)){
            System.out.println("The areas of both rectangles are the same");
            return 0;
        }else{
            return -1;
        }

    }

    //override object .equals
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Rectangle && getArea() == ((Rectangle) obj).getArea();
    }

}