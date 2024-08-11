import java.lang.String;
public class reverse_string {
    public static String rev(String s){
        String res="";
        for (int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
        }
        return res;
    }
    public static void main(String[]args){
        String str="nithya";
        System.out.println(rev(str));
    }
}
