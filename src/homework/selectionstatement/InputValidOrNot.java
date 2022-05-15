package homework.selectionstatement;

import java.util.Scanner;

public class InputValidOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double score = sc.nextDouble();
        if (score < 0 || score > 10) {
            System.out.println("The score is not valid");
        }
        else {
            System.out.println("The score is valid");
        }
    }
}
