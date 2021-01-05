package array_method_java.thuc_hanh;

public class TimGTNNtrongARR {
    public static int minValue(int[] arr) {
        int min = arr[0];
        int index=1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index=i+1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 7, 6, 3, 52, 14, 25};
        int index = minValue(arr);
        System.out.println("Index cua gia tri nho nhat trong mang la: " + index);
    }
}

