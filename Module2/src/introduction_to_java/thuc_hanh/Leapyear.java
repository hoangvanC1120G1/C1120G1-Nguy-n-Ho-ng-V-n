package introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner check = new Scanner(System.in);
        int yearcheck;
        System.out.println("Input year: ");
        yearcheck = check.nextInt();
        if(yearcheck % 4 == 0){
            if(yearcheck % 100 == 0){
                if(yearcheck % 400 == 0){
                    System.out.print(yearcheck+" La nam nhuan");
                } else {
                    System.out.print(yearcheck+" Khong phai la nam nhuan");
                }
            } else {
                System.out.print(yearcheck+" La nam nhuan");
            }
        } else {
            System.out.print(yearcheck+" khong phai la nam nhuan");
        }
    }
}
