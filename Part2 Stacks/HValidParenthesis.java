import java.util.*;
public class HValidParenthesis {
    public static boolean isValid(String str) {
    Stack<Character> s = new Stack<>();

        for(int i =0; i< str.length(); i++){
            char ch = str.charAt(i);
            
             if(ch == '(' || ch == '{' || ch == '{') {// opening case
                s.push(ch);
            
             }else{
                //closing case  there is no opening bracket in this though stack is empty
                if(s.isEmpty()){
                    return false;
        
                }
                if( (s.peek() == '(' && ch == ')' )         // ()
                    || (s.peek() == '{' && ch == '}')      // {}
                    || (s.peek() == '[' && ch == ']') ){  // []
                    s.pop();
                    }else{
                        return false;
                    }
                }
            }
        if(s.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        String str = "()({})[]"; // true
        System.out.println(isValid(str));
    }    // T.C = O(n)
}