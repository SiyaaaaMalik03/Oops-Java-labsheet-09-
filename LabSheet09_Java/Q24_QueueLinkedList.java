import java.util.*;
public class Q24_QueueLinkedList {
 public static void main(String[] args) {
  Queue<String> q=new LinkedList<>(); q.add("First");q.add("Second");q.add("Third");
  System.out.println(q); System.out.println("Removed: "+q.remove()); System.out.println(q);
 }
}
