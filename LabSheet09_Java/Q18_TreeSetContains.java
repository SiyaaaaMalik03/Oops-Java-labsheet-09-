import java.util.*;
public class Q18_TreeSetContains {
 public static void main(String[] args) {
  TreeSet<Integer> a = new TreeSet<>(Arrays.asList(10,20,30));
  System.out.println("Contains 20? "+a.contains(20));
  System.out.println("Contains 50? "+a.contains(50));
 }
}
