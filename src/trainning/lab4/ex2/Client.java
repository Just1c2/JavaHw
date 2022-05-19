package trainning.lab4.ex2;

public class Client {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        movablePoint.setX(3);
        movablePoint.setY(4);
        movablePoint.moveUp();
        movablePoint.moveLeft();
        System.out.println("Vi tri moi la " + movablePoint.x + ";" + movablePoint.y);
    }
}
