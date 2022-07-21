package reviewquestions;

import java.util.Scanner;

public class PrimeNumber {
    public static void checkprime() {
        int i, count = 0;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter a number: ");
            int num = sc.nextInt();

            for (i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0 && num != 1)
                System.out.println("It is a prime number.");
            else
                System.out.println("It is not a prime number");
        }
    }

    public static void main(String[] args) {
        checkprime();
    }
}