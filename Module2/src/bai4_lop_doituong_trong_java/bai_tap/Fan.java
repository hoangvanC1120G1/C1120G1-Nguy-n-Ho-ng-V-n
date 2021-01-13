package bai4_lop_doituong_trong_java.bai_tap;

public class Fan {
    private int speed;
    boolean on=true;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public String displaySpeed(){
        String str = "";
        switch (this.speed) {
            case 1:
                str = "Slow";
                break;
            case 2:
                str = "Medium";
                break;
            case 3:
                str = "Fast";
                break;
        }
        return str;
    }


    public Fan() {

    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
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




    @Override
    public String toString() {
        if(on){
        return "Fan{" +
                " speed=" + displaySpeed() +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
        }else{
            return "Fan{" +
                    "Fan is off"+
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
    public static void main(String[] args) {
        Fan fan = new Fan(1,true,10,"Yellow");
        Fan fan2 = new Fan(3,false,7,"red");
        System.out.println(fan.toString());
        System.out.println(fan2.toString());
    }
}
