package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter you name:");
        String hello=scanner.nextLine();
        System.out.println("Hello: "+hello);
    }
//    public static void show(){
//        System.out.println(tinh());
//        System.out.println("hello");
//    }
//    public static int tinh(){
//        return 1+3;
//    }
}
