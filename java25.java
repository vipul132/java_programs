
//Java program to check whether the given String text is a Palindrome
import java.util.Scanner;

public class java25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String Text");
        String originalText = sc.nextLine();
        char[] ca = originalText.toCharArray();
        int size = ca.length;
        String reverseText = "";

        for (int i = size - 1; i >= 0; i--) {
            reverseText = reverseText + ca[i];
        }

        if (originalText.equals(reverseText)) {
            System.out.println(originalText + " is a Palindome");
        } else {
            System.out.println(originalText + " is not a Palindrome");
        }
    }
}