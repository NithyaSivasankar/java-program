import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class remove_duplicate_in_array {
    public static void dupicate(int[] a){
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(int i=0;i<a.length;i++){
            if(map.containsKey(a[i])){
                continue;
            }
            else{
                map.put(a[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> i:map.entrySet()) {
            System.out.print(i.getKey());
        }
    }
    public static void main(String[]args){
        int[] arr={2,3,4,8,4,2};
        dupicate(arr);

    }
}
