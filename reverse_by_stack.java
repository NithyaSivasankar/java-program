import java.util.Stack;

public class reverse_by_stack {
    public static String rev(String s){
        String t="";
        Stack<Character> st= new Stack<>();
        for(int i=0;i<s.length();i++){
            st.push(s.charAt(i));
        }
        while (!st.empty()) {
            t += st.pop();
        }
        return t;
    }
    public static void main(String args[]){
        String str="hello world";
        System.out.println(rev(str));
    }
}
