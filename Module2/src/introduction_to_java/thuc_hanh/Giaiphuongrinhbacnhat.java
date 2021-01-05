package introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Giaiphuongrinhbacnhat {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double a,b,c;
        System.out.print("A : ");
        a=sc.nextDouble();
        System.out.print("B: ");
        b=sc.nextDouble();
        System.out.print("C: ");
        c=sc.nextDouble();
        if(a!=0){
            double solution=(c-b)/a;
            System.out.printf("The solution is: x= %f!\n",solution);
        }else if (b==0) {
            System.out.print("The solution is all x!");
        }else {
            System.out.println("No solution!");
        }
    }
}
