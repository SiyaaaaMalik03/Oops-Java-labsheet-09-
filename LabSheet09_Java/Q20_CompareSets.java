import java.util.*;
public class Q20_CompareSets {
 public static void main(String[] args) {
  int[] nums={30,10,20,10,40};
  HashSet<Integer> h=new HashSet<>(); LinkedHashSet<Integer> l=new LinkedHashSet<>();
  TreeSet<Integer> t=new TreeSet<>();
  for(int n:nums){h.add(n);l.add(n);t.add(n);}
  System.out.println("HashSet (order not guaranteed): "+h);
  System.out.println("LinkedHashSet (insertion order): "+l);
  System.out.println("TreeSet (sorted): "+t);
 }
}
