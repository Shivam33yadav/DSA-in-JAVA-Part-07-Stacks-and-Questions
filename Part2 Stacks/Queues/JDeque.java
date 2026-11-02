import java.util.*;
public class JDeque { 
    public static void main(String[] args) { // in JCF Deque is an interface
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);  // yahn tak to hum add kr skte hh
         //we can also remove by
        // deque.removeFirst();
         //System.out.println(deque);
        
    }
    
}
