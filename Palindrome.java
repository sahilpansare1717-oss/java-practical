import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a word to check if it's a palindrome : ");
        String word = sc.nextLine();

        StringBuilder reverse = new StringBuilder(word);
        reverse.reverse();

        if (word.equalsIgnoreCase(reverse.toString())) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }

        sc.close();
    }
}
