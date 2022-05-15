package homework;

import java.util.Scanner;

public class InputStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        System.out.println("In the next 15 years, age of " + name + "will be " + (age + 15));
    }
}
