import java.util.*;
public class Q16_HashSetIterator {
 public static void main(String[] args) {
  HashSet<Integer> a = new HashSet<>(Arrays.asList(11,22,33));
  Iterator<Integer> it=a.iterator(); while(it.hasNext()) System.out.println(it.next());
 }
}
