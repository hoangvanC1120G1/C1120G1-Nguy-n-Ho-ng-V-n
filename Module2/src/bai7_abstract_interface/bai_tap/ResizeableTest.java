package bai7_abstract_interface.bai_tap;

import java.util.Random;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[3];
        shapes[0]=new Circle(1.5,"yellow",true);
        shapes[1]=new Rectangle(2.5,3.5);
        shapes[2]=new Square(3.5,"Blue",false) ;
        // tạo ra 1 biến resizeable có kiểu dữ liệu là Resizeable, có giá trị khởi tạo null
        // dùng để lưu đối tượng sau khi ép shape về Circle hoặc về Rectangle
        Resizeable resizeable = null;

        for(Shape shape : shapes){
            if (shape instanceof Circle){
                resizeable =(Circle) shape;
                System.out.println("Circle Area : "+((Circle) shape).getArea());
            } else if (shape instanceof Rectangle) {
                resizeable = (Rectangle) shape;
                System.out.println("Rectangle Area : " + ((Rectangle) shape).getArea());
            } else if(shape instanceof Square){
                resizeable=(Square)shape;
            }
            Random random = new Random();
            int percent = random.nextInt(99) +1;
            System.out.println("Percent : "+percent+" %");

            resizeable.resize(percent);
            System.out.println(resizeable);

//            if (shape instanceof Circle){
//                ((Circle) shape).resize(percent);
//                System.out.println("Circle Area after : "+((Circle) shape).getArea());
//            } else if (shape instanceof Rectangle) {
//                ((Rectangle) shape).resize(percent);
//                System.out.println("Rect area after : "+((Rectangle) shape).getArea());
//            }
        }

    }
}
