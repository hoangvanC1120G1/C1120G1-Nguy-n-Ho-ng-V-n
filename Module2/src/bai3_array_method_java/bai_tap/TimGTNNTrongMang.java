package bai3_array_method_java.bai_tap;

import java.util.Scanner;

public class TimGTNNTrongMang {
    public static void main(String[] args) {
        int[] arr;
        arr = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 7 phan tu cua mang");
        for (int i = 0; i < arr.length; i++) {
            int input = sc.nextInt();
            arr[i] = input;
        }
        System.out.print("Cac phan tu cua mang la: ");
        for (int a : arr) {
            System.out.print(a + ",");
        }
        System.out.println(" ");
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println("GTNN la: " + min);
    }
}
