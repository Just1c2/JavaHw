package trainning.exception;

import java.util.Scanner;

public class UncheckedException {
    public UncheckedException() {

    }

    public static void main(String[] args) {
        try {
            int i, n = 2;
            int a[] = new int[n];

            java.util.Scanner input = new java.util.Scanner(System.in);

            for (i = 0; i <= n; i++) {
                System.out.printf("a[%d] = ", i);
                a[i] = input.nextInt();
            }
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Cannot put more than 2 number in the array");
        }
    }
}

