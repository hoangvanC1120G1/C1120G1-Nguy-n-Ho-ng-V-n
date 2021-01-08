package ke_thua.bai_tap;

public class Cylinder extends Circle {
    private double high;
    public Cylinder(){
    }
    public Cylinder(double high,double radius,String color){
        super(radius, color);
        this.high=high;
    }
    public double getVolumeCylinder(){
        double volumeCylinder= 2*Math.PI*this.radius*this.radius;
        return  volumeCylinder;
    }
    public double getHigh() {
        return high;
    }
    public void setHigh(double high) {
        this.high = high;
    }
}
