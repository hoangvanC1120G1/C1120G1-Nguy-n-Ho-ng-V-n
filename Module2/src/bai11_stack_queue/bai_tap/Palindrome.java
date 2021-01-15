package bai11_stack_queue.bai_tap;


import java.util.*;


public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi muon kiem tra");
        String inputchar = scanner.nextLine();
        Stack stack = new Stack<>();
        Queue queue = new LinkedList<>();
        for (int i=0;i<inputchar.length();i++){
            queue.add(inputchar.charAt(i));
            stack.push(inputchar.charAt(i));
        }
        if(stack.peek().equals(queue.peek())){
            System.out.println("chuoi doi xung");
        }else {
            System.out.println("khong phai doi xung");
        }
    }
}
