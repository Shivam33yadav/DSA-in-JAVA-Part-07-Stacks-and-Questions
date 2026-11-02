import java.util.*;
public class DQueuesUsingJavaCollectionFramew {
    public static void main(String[] args) {
      //  Queue q = new Queue();
      Queue<Integer> q = new LinkedList<>();  // wRiting linked list because queue is not a class queue is an interfaces ..and we cant make objects of interfaces
      // ya to Linkedlist se ya ArrayDequeue se Queue bnayenge  (difference?
      q.add(1);
      q.add(2);
      q.add(3);

      while(!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
      }

                               //hum jiski queue chahe bna skte whether it is integere, string, boolean
        }
    }
    

