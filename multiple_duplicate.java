import java.util.HashMap;

public class multiple_duplicate {
    public static void main(String[]args){
        int[] a={1,2,3,1,23,4,5,6,6};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++){
           if(map.containsKey(a[i])){
               System.out.println(a[i]);
           }
           else{
               map.put(a[i],1);
           }
        }
    }
}
