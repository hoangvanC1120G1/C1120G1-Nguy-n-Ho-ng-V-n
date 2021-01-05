package loop_in_java.bai_tap;

public class HienThi20SoNguyenTo {
    public static void main(String[] args) {
        int input = 20;
        int dem = 1;
        int n = 2;
        while (dem <= input) {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(n);
                dem++;
            }
            n++;
        }
    }
}

