package bai6_ke_thua.bai_tap;

public class Circle {
    protected double radius;
    protected String color;
    public Circle(){

    }
    public Circle(double radius,String color){
         this.radius=radius;
         this.color=color;
    }
    public double getacreage(){
        double acreage= radius*radius*Math.PI;
        return acreage;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
