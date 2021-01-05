package array_method_java.thuc_hanh;

import java.util.Scanner;

public class Timgiatrilonnhattrongmang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter size");
            size = sc.nextInt();
            if(size>20){
                System.out.println("size khong duoc lon hon 20");
            }
        }while (size>20);
        array=new int[size];
        int i=0;
        while (i<array.length){
            System.out.println("Enter element"+(i+1)+" ");
            array[i]=sc.nextInt();
            i++;
        }
        int max=array[0];
        int index=1;
        for(int j=0;j<array.length;j++){
            if (array[j]>max){
                max=array[j];
                index=j+1;
            }
        }
        System.out.println("Gia tri lon nhat la: "+max);
        System.out.println("Tai vi tri la: "+ index);
    }
}
