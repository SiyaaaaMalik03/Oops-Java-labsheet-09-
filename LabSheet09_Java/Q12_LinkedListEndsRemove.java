import java.util.*;
public class Q12_LinkedListEndsRemove {
 public static void main(String[] args) {
  LinkedList<Integer> a = new LinkedList<>(Arrays.asList(10,20,30,40));
  a.removeFirst(); a.removeLast(); System.out.println(a);
 }
}
