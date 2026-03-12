//Java program to reverse a String
import java.util.Scanner;

public class java24 {
    public static void main(String[] args){
        String str = "Pandey";
        char[] ca = str.toCharArray();
        int size = ca.length;
        String reverseString = "";

        for(int i=size-1; i>=0; i--){
            reverseString = reverseString + ca[i];
        }
        System.out.println(reverseString);
    }
}
