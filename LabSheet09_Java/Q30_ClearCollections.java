import java.util.*;
public class Q30_ClearCollections {
 public static void main(String[] args) {
  List<Integer> list=new ArrayList<>(Arrays.asList(1,2));
  Set<Integer> set=new LinkedHashSet<>(Arrays.asList(10,20));
  Queue<Integer> q=new LinkedList<>(Arrays.asList(100,200));
  list.clear();set.clear();q.clear();
  System.out.println("List: "+list);System.out.println("Set: "+set);System.out.println("Queue: "+q);
 }
}
