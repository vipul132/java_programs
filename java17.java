//Swap two numbers with using a temporary variable

public class java17 {
    public static void main(String[] args) {
        int a = 10;
        int b = 14;
        System.out.println("Before swapping: a = " + a + " and b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + " and b = " + b);
    }
}
