package homework.loopstatement;

import java.util.Scanner;

public class InputNumDivBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                System.out.println(i + " ");
            }
        }
    }
}
