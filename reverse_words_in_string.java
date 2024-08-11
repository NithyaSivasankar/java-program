import java.util.*;
public class reverse_words_in_string {
    public static void main(String[] args) {
        String s = "java is pl";
        Stack<String> str = new Stack<>();
        //str=s.split(" ");
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                str.push(res);
                res="";
            } else {
                res += s.charAt(i);
            }
        }
        if (!res.isEmpty()) {
            str.push(res);
        }
        res="";
        while (!str.empty()) {
            res += str.pop();
            if (!str.empty()) {
                res += " ";
            }
        }
        System.out.println(res);
    }
}


        /*}(str:s.split(" ")){
            res+=str.pop();
            res+=" ";
        }
        System.out.println(res);

    }
}}*/
