package array_method_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        boolean flag = true;
        int[] arr = {2, 5, 8, 8, 6, 8, 12, 15};
        while (flag) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap phan tu can xoa: ");
            int newInput = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (newInput == arr[i]) {
                    flag = false;
                    for (int j = i; j < arr.length - 1; j++) {
                        arr[j] = arr[j + 1];
                    }
                    i--;
                    arr[arr.length - 1] = 0;
                }
            }
            for (int a : arr) {
                System.out.print(a+", ");
            }
            System.out.println("");
            if (flag) {
                System.out.print("Khong co "+ newInput +" trong mang vui long nhap lai");
            }
            System.out.println("");
        }
    }
}
