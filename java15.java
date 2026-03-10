//Java program to find the sum of all even numbers from 1 to 10

public class java15 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum of all even numbers from 1 to 10 is: " + sum);
    }
}
