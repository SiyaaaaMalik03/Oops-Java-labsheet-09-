import java.util.*;
public class Q07_ArrayListIterator {
 public static void main(String[] args) {
  ArrayList<Integer> a = new ArrayList<>(Arrays.asList(5,10,15));
  Iterator<Integer> it=a.iterator(); while(it.hasNext()) System.out.println(it.next());
 }
}
