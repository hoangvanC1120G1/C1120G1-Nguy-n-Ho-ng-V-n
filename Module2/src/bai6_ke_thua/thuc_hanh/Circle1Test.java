package bai6_ke_thua.thuc_hanh;

public class Circle1Test {
    public static void main(String[] args) {
        Circle1 circle = new Circle1();
        System.out.println(circle);

        circle = new Circle1(3.5);
        System.out.println(circle);

        circle = new Circle1(3.5, "indigo", false);
        System.out.println(circle);
    }
}
