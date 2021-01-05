package loop_in_java.Thuchanh;

import java.util.Scanner;

public class tim_uoc_chung_lon_nhat {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Input number a");
        a=sc.nextInt();
        System.out.println("Input number b");
        b=sc.nextInt();
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0&&b==0)
            System.out.println("vo cuc");
        if(a==0&&b!=0) {
            System.out.println("ucln la: " + b);
        }else if(a!=0&&b==0) {
            System.out.println("ucln la: "+a);
        }
        while (a!=b){
            if (a>b){
                a= a-b;
            }else {
                b=b-a;
            }
        }
        System.out.println("Greatest common factor: "+a);
    }
}
