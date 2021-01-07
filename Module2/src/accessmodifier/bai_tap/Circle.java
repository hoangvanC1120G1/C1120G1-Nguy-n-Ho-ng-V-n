package accessmodifier.bai_tap;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {

    }

    public Circle(long radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    protected String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public static class Test{
        public static void main(String[] args) {
            Circle circle= new Circle();
            System.out.println(circle.getRadius());
            System.out.println(circle.getColor());
        }
    }
}



