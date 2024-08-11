import java.util.*;
public class two_arrays_equal_or_not {
    public static boolean check(int[] a,int[] b){
         Arrays.sort(a);
         Arrays.sort(b);
         if(a.length==b.length){
             for(int i=0;i<a.length;i++){
                 if(a[i]==b[i]){
                     return true;
                 }
             }
         }
         return false;
    }
    public static void main(String args[]){
        int[]a={3,7,5,8};
        int[]b={3,7,5,8};
        System.out.println(check(a,b));
    }
}
