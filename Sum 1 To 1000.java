package sahil;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 1000: ");
        int number = sc.nextInt();

        if (number >= 1 && number <= 1000) {
            int temp = number;
            int sum = 0;

            do {
                sum += temp % 10;
                temp /= 10;
            } while (temp > 0);

            System.out.println("Sum of digits of " + number + " is: " + sum);
        } else {
            System.out.println("The entered number is not between 1 and 1000.");
        }

        sc.close();
    }
}
