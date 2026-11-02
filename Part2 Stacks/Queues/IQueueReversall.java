import java.util.*;
public class IQueueReversall {
    public static void reverse(Queue<Integer> q) {
        Stack<Integer> s = new Stack<>();
        
        // jab tak queu khali nhi ho jatii  tabtak uske elemngts ko stack m dalte  rheng
        while(!q.isEmpty()) {
            s.push(q.remove()); // we use this style always

        }
        while(!s.isEmpty()) {
            q.add(s.pop());
        }
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
           q.add(1);
           q.add(2);
           q.add(3);
           q.add(4);
           q.add(5);

           reverse(q);

           //print q
           while(!q.isEmpty()) {
            System.out.println(q.remove()+" ");
           }
           System.out.println();
    }
    
}
