package bai2_loop_in_java.bai_tap;


public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int n=2;
        while (n<100){
            int count=0;
            for(int i=1;i<=n;i++){
                if(n%i==0){
                    count++;
                }
            }if(count==2){
                System.out.println(n);
            }
            n++;
        }
        System.out.println("Cac so nguyen to nho hon 100");
    }
}
