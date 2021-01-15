package bai11_stack_queue.bai_tap;
import java.util.*;


public class MyBinary {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Nhap so thap phan");
        int num=scanner.nextInt();

        Stack<Integer> stack = new Stack<>();
        while (num!=0){
            int d=num%2;
            stack.push(d);
            num=num/2;
        }
        System.out.println("Chuyen sang nhi phan la:");
//       ListIterator iterator=stack.listIterator();
//        while (iterator.hasPrevious()){
//            Object i = iterator.previous();
//            System.out.print(i);
//        }
////
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        // phan doi tu nhi phan sang thap phan
//        System.out.println("");
//        System.out.println("nhap so nhi phan");
//        String num2=scanner.nextLine();
//        System.out.println(Integer.parseInt(num2,2));
    }
}
