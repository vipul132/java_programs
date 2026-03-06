import java.util.Scanner;

//CHeck wether the given input number is even or add
public class java5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Number");
        int num = sc.nextInt();

        if(num%2==0){
            System.out.println("Given number " + num + " is an even number");
        }else{
            System.out.println("Given number " + num + " is an odd number");
        }

        sc.close();
    }
}