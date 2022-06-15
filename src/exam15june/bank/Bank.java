package exam15june.bank;

import java.util.Scanner;

public class Bank {
    static Scanner sc = new Scanner(System.in);
    private static double balance;
    private static double rate;

    public Bank(double balance, double rate) {
        this.balance = balance;
        this.rate = rate;
    }

    public static void calculateInterest() {
        System.out.println("Enter the money that you are in debt: ");
        balance = sc.nextDouble();
        System.out.println("Enter the annual interest rate: ");
        rate = sc.nextDouble();
        System.out.println("The monthly interest that you have to pay is: " + balance * (rate/1200));
    }

    public static void main(String[] args) {
        calculateInterest();
    }
}
