package bai11_stack_queue.bai_tap;

import java.util.Stack;

public class BracketIs {
    public boolean bracKetIs(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c=='('){
                stack.push(c);
            }
            if(c==')'){
                if(stack.empty()){
                    return false;
                }else if(stack.peek()=='('){
                    stack.pop();
                }else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        BracketIs bracketIs=new BracketIs();
        System.out.println(bracketIs.bracKetIs("(– (b) + (b2 – 4*a*c)^0.5) / 2*a"));
    }
}

