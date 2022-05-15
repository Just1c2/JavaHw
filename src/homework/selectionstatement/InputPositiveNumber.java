package homework.selectionstatement;

import java.util.Scanner;

public class InputPositiveNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("n is a positive number");
        }
        if (n < 0) {
            System.out.println("n is an negative number");
        }
        else {
            System.out.println("n is equal to 0");
        }
    }
}
