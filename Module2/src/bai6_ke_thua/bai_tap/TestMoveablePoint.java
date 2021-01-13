package bai6_ke_thua.bai_tap;

public class TestMoveablePoint {
    public static void main(String[] args) {
        MoveablePoint moveablePoint=new MoveablePoint(2,3,4,5);
        System.out.println(moveablePoint.toString());
        System.out.println("move x,y"+ moveablePoint.move());
        System.out.println("move x,y"+ moveablePoint.move());
        System.out.println("move x,y"+ moveablePoint.move());
    }
}
