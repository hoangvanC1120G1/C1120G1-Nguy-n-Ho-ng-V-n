//package bai9_arraylist.bai_tap;
//
//import java.util.Arrays;
//
//public class MyList<E> {
//    private int size=0;
//    private static final int DEFAULT_CAPACITY=10;
//    private Object elements[];
//    public MyList(){
//
//    }
//    public MyList(int capacity){
//        elements= new Object[DEFAULT_CAPACITY];
//    }
//    public void ensureCapa() {
//        int newSize = elements.length * 2;
//        elements = Arrays.copyOf(elements, newSize);
//    }
//    public void add(int index,E element){
//        if(size==elements.length){
//           ensureCapa();
//        }
//    }
//    public E remove(int index){
//
//    }
//
//
//}
