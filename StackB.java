import java.util.ArrayList;

public class StackB{
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();
         public static boolean isEmpty() {
              return list.size() == 0;
         }

         // push
         public static void push(int data){
            list.add(data); //stack k top pr data add 

         }

         // pop
         public static int pop(){ // int is because us data ko delete hone se pehle store kr lete h then return
            if(isEmpty()){
                return -1; 
            }
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1); // 0(1)
        return top;

         }
         //peek
         public static int peek(){
            if(isEmpty()){
            return -1;
         }
             return list.get(list.size() - 1);
             
         }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){  //jab tak stack khali na ho jae
            System.out.println(s.peek());
            s.pop();
        }
    }
}