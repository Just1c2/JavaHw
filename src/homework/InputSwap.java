package homework;

import java.util.Scanner;

public class InputSwap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("After swaping, a = " + a + " b = " + b);
    }
}
