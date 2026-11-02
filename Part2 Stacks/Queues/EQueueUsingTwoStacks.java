import java.util.*;
public class EQueueUsingTwoStacks {   // by method push  PYQ MICROSOFT GOOGLE
    static class Queue {
         static Stack<Integer> s1 = new Stack<>();
         static Stack<Integer> s2 = new Stack<>();

         public static boolean isEmpty(){
            return s1.isEmpty();
         }

         //add  O(n) linear time kyuki while loop is running 
         public static void add(int data){
            while(!s1.isEmpty()) {   // jab tak s1 khali nhi hota tab tak s1 k element ko pop kraye 
                s2.push(s1.pop());
            }

            //2nd step
            s1.push(data);

            while(!s2.isEmpty()) {
                s1.push(s2.pop());
            }
         }

         // remove
         public static  int remove(){
            if(isEmpty()){
                System.out.println("queue empty");
                return -1;
            }
            return s1.pop();
            }
            // peeke
            public static int peek(){
                if(isEmpty()){
                    System.out.println("queue is empty");
                    return -1;
                }
                return peek();
            }
         }
         public static void main(String[] args) {
            Queue q = new Queue();
            q.add(1);
            q.add(2);
            q.add(3);

            while(!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();
            }
         }
    }

    //ANS 1 2 3

