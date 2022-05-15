package homework.whileloops;

import java.util.Scanner;

public class InputWhile3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 1;
        while (b > 0) {
            result *= a;
            b--;
        }
        System.out.println(result);
    }
}
