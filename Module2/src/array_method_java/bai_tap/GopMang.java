package array_method_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1;
        arr1 = new int[5];
        int[] arr2;
        arr2 = new int[7];
        int[] arr3;
        arr3 = new int[12];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mang 1 gom 5 phan tu: ");
        for (int i=0; i < arr1.length; i++) {
            int input1 = sc.nextInt();
            arr1[i] = input1;
        }
        System.out.println("Nhap mang 2 gom 7 phan tu: ");
        for (int j = 0; j < arr2.length; j++) {
            int input2 = sc.nextInt();
            arr2[j] = input2;
        }
        int temp=0;
        for (int k=0;k<arr1.length;k++){
            arr3[k]=arr1[k];
            temp++;
        }
        for (int l=0;l<arr2.length;l++){
            arr3[temp]=arr2[l];
            temp++;
        }
        for (int a:arr3){
            System.out.print("New Array"+a);
        }
    }
}
