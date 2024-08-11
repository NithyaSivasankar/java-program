import java.util.*;
public class remove_given_ele {
    public static void main(String args[]){
        int[] a={1,2,3,4,2};
        int key=2;
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(a[i]==key) {
                continue;
            }
            else{
                set.add(a[i]);
            }
        }
        System.out.println(set);
    }
}
