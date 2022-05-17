package homework.array;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0 && arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
