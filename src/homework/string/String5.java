package homework.string;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for (char c = '0'; c <= '9'; c++) {
            s.replace(c + "", "");
        }
        System.out.println(s);
    }
}
