//Java program which intakes String and prints the duplicate characters along with number of times
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class java21{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String");
        String str = sc.nextLine();
        char[] ca = str.toCharArray();
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        for(Character c : ca){
            if(m.containsKey(c)){
                m.put(c, m.get(c)+1);
            }else{
                m.put(c,1);
            }
        }
        System.out.println(m);

        sc.close();
    }
}