
package d_w_j9;

public class circle {
   private double radius=1.0;
      private String color="red";
    private double area=(22/7);
    public circle() {
    }

    public circle(double radius ) {
        this.radius=radius;
    }
     public double getRadius() {
        return radius;
    }
    public double getArea() {
        return area*radius*radius;
    } 
}
