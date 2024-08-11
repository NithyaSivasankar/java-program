import java.util.*;
public class common_ele_in_array {
    public static void common(char[] a,char[] b){
        List<Character> l=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            for (int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    l.add(a[i]);
                }
            }
        }
        System.out.println(l);
    }
    public static void main(String args[]){
        char[] a={'a','b','c','d'};
        char[] b={'b','c','e'};
        common(a,b);
    }
}
