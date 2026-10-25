import java.util.*;
public class Q22_PriorityQueueRemove {
 public static void main(String[] args) {
  PriorityQueue<Integer> q=new PriorityQueue<>(Arrays.asList(30,10,20,5));
  while(!q.isEmpty()) System.out.println("Removed: "+q.remove());
 }
}
