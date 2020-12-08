import sun.jvm.hotspot.oops.CompiledICHolder;

public class Circle extends GeometricObject implements Comparable{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /** Return radius */
    public double getRadius() {
        return radius;
    }

    /** Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override /** Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    @Override /** Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }

    //from comparable interface
    @Override
    public int compareTo(Object obj) {
        Circle c1 = (Circle)obj;

        if(c1.equals(obj)){
            System.out.println("The radius of both objects are the same");
            return 0;
        }else{
            return -1;
        }

    }

    //override object .equals
    @Override
    public boolean equals(Object obj) {
        return obj instanceof Circle && radius == ((Circle) obj).radius;
    }
}