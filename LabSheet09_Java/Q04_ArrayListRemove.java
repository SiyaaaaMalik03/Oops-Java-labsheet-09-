import java.util.*;
public class Q04_ArrayListRemove {
 public static void main(String[] args) {
  ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10,20,30,20));
  a.remove(0); a.remove(Integer.valueOf(20)); System.out.println(a);
 }
}
