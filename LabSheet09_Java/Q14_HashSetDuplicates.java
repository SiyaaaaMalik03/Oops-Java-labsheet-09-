import java.util.*;
public class Q14_HashSetDuplicates {
 public static void main(String[] args) {
  HashSet<Integer> a = new HashSet<>(Arrays.asList(10,20,10,30));
  System.out.println("Duplicate values are stored once: "+a);
 }
}
