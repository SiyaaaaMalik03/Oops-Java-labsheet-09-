import java.util.*;
public class Q28_ListToSet {
 public static void main(String[] args) {
  List<Integer> list=Arrays.asList(10,20,10,30,20);
  Set<Integer> set=new LinkedHashSet<>(list);
  System.out.println("List: "+list);System.out.println("Set: "+set);
 }
}
