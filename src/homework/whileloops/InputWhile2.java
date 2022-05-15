package homework.whileloops;

import java.util.Scanner;

public class InputWhile2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        int result = 0;
        while (i <= n) {
            if (n % i == 0) {
                result++;
            }
            i++;
        }
        System.out.println(result);
    }
}
