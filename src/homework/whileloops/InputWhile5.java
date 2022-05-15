package homework.whileloops;

import java.util.Scanner;

public class InputWhile5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i == 51) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
