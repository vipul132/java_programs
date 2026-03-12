//Java program to print number of letters, digits, spaces and other things in the inputted statement
import java.util.Scanner;

public class java22{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();
        char[] ca = str.toCharArray();
        int digits = 0;
        int letters = 0;
        int spaces = 0;
        int others = 0;

        for(Character c : ca){
            if(Character.isDigit(c)){
                digits++;
            }else if(Character.isLetter(c)){
                letters++;
            }else if(Character.isSpaceChar(c)){
                spaces++;
            }else{
                others++;
            }

        }
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of letter " + letters);
        System.out.println("Number of Spaces " + spaces);
        System.out.println("Number of Other things " + others);
    }
}