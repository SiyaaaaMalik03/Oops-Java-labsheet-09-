import java.util.*;
public class Q06_ArrayListForEach {
 public static void main(String[] args) {
  ArrayList<String> a = new ArrayList<>(Arrays.asList("Apple","Mango","Banana"));
  for(String item:a) System.out.println(item);
 }
}
