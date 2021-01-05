package array_method_java.thuc_hanh;

import java.util.Scanner;

public class TimGTTrongMang {
    public static void main(String[] args) {
        String[] student={"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name=sc.nextLine();
        boolean isExit=false;
        for(int i=0;i<student.length;i++){
            if(student[i].equals(name)){
                System.out.println("Position of the students in the list " + name + " is: " + (i + 1));
                isExit=true;
                break;
            }
        }if(!isExit){
            System.out.println("Not found" + name + " in the list.");
        }
    }
}
