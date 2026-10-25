import java.util.*;
public class Q29_SetToList {
 public static void main(String[] args) {
  Set<String> set=new LinkedHashSet<>(Arrays.asList("Apple","Mango","Banana"));
  List<String> list=new ArrayList<>(set);
  for(String item:list)System.out.println(item);
 }
}
