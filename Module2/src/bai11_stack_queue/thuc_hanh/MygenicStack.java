//package bai10_stack_queue.thuc_hanh;
//
//import com.sun.xml.internal.bind.v2.model.core.NonElement;
//
//import java.util.EmptyStackException;
//import java.util.LinkedList;
//
//public class MygenicStack<T> {
//    private LinkedList<T> stack;
//
//    MygenicStack() {
//        stack = new LinkedList<>();
//    }
//
//    public void push(T element) {
//        stack.addFirst(element);
//    }
//
//
//    public T pop(){
//        if(isEmpty()){
//            throw new EmptyStackException();
//        }
//        return stack.removeFirst();
//    }
//
//    private boolean isEmpty() {
//    }
//
//    public int size(){
//        return stack.size();
//    }
//    private static void stackOfIStrings(){
//        MygenicStack<String> stack=new MygenicStack();
//        stack.push("First");
//        stack.push("Second");
//        stack.push("Three");
//        System.out.println("1.1 Size of stack after push operations: " + stack.size());
//        System.out.printf("1.2. Pop elements from stack : ");
//        while (!stack.isEmpty()) {
//            System.out.printf(" %s", stack.pop());
//        }
//        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
//    }
//}
