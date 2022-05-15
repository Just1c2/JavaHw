package homework.selectionstatement;

import java.util.Scanner;

public class InputQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("This point lies in the First quadrant");
        } else if (x < 0 && y > 0) {
            System.out.println("This point lies in the Second quadrant");
        } else if (x < 0 && y < 0) {
            System.out.println("This point lies in the Third quadrant");
        } else if (x > 0 && y < 0) {
            System.out.println("This point lies in the Forth quadrant");
        } else {
            System.out.println("This point lies in the middle of the quadrant");
        }
    }
}
