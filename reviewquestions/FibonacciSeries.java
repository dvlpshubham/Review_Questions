package reviewquestions;

import java.util.Scanner;

public class FibonacciSeries {
    public static void checkSeies() {
        int firstTerm=0;
        int secondterm=1;

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value of A :");
        int number = sc.nextInt();

        for (int i=0; i<=number; i++ ) {
            int nextTerm = firstTerm + secondterm;
            firstTerm = secondterm;
            secondterm = nextTerm;

            System.out.println("The FibonacciSeies are : " + nextTerm);
        }
        sc.close();
        }

    public static void main(String[] args) {
        checkSeies();
    }
}
