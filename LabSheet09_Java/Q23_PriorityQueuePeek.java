import java.util.*;
public class Q23_PriorityQueuePeek {
 public static void main(String[] args) {
  PriorityQueue<Integer> q=new PriorityQueue<>(Arrays.asList(25,5,15));
  System.out.println("Head: "+q.peek()); System.out.println("Queue unchanged: "+q);
 }
}
