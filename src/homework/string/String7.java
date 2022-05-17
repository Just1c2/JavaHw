package homework.string;

import java.util.Scanner;

public class String7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String answer = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            answer += s.charAt(i);
        }
        System.out.print(answer);
    }
}
