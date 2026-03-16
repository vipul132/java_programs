//Java program to remove the duplicates from the Array with the help of HashSet

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class java30 {
  public static void main(String[] args){
    int[] a = {5,3,4,5,5,4,9,7,6,9};
    Set<Integer> set = new HashSet<Integer>();

    for(int i=0; i<a.length; i++){
        set.add(a[i]);
    }

    Integer[] b = set.toArray(new Integer[set.size()]);
    System.out.println(Arrays.toString(b));
  }  
}
