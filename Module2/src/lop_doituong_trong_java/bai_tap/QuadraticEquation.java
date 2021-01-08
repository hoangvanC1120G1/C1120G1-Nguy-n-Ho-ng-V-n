package lop_doituong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public QuadraticEquation() {

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return this.b * this.b - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return (-b + Math.sqrt(getDiscriminant())) / 2 * a;
    }

    public double getRoot2() {
        return (-b - Math.sqrt(getDiscriminant())) / 2 * a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a:");
        double a = sc.nextDouble();
        System.out.println("Nhap b:");
        double b = sc.nextDouble();
        System.out.println("Nhap c:");
        double c = sc.nextDouble();
        QuadraticEquation returndelta = new QuadraticEquation(a, b, c);
        if (returndelta.getDiscriminant() > 0) {
            System.out.println("Phuong trinh co 2 nghiem: ");
            System.out.println(returndelta.getRoot1());
            System.out.println(returndelta.getRoot2());
        } else if (returndelta.getDiscriminant() == 0) {
            System.out.println("Phuong trinh co 1 nghiem: " + returndelta.getRoot1());
        } else {
            System.out.println("The equation has no roots");
        }

    }
}
