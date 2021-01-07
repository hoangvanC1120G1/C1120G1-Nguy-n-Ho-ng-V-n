package array_method_java.bai_tap;

        import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 8, 7, 9};
        int[] arr2;
        arr2 = new int[7];
        boolean flag = true;
        while (flag) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhap gia tri can them");
            int newInput = sc.nextInt();
            System.out.println("Nhap vi tri can them");
            int index = sc.nextInt();
            if (index < 0 || index > arr2.length) {
                System.out.println("Vi tri ban nhap khong co trong mang vui long nhap lai");
                flag = true;
            }
            if (index > 0 && index < arr2.length) {
                flag = false;
                for (int i = 0; i < arr.length; i++) {
                    arr2[i] = arr[i];
                }
                for (int j = index-1; j < arr2.length - 1; j++) {
                    arr2[j + 1] = arr[j];
                }
                arr2[index-1] = newInput;
                System.out.print("New Array: ");
                for (int a : arr2) {
                    System.out.print(a + ", ");
                }
            }
        }
    }
}

