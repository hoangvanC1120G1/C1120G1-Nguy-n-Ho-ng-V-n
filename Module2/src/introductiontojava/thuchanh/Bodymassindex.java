package introductiontojava.thuchanh;

import java.util.Scanner;

public class Bodymassindex {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        double weight, height, bmi;
        System.out.println("Input weight: ");
        weight=sc.nextDouble();
        System.out.println("Input height: ");
        height=sc.nextDouble();
        bmi = weight/Math.pow(height,2);
        if(bmi<18){
            System.out.println("Ban qua om, nen an uong nhieu them");
        } else if(bmi<25){
            System.out.println("Ban binh thuong");
        }else if(bmi<30){
            System.out.println("Ban hoi map");
        }else if(bmi>30){
            System.out.println("Ban bi beo phi");
        }
    }
}
