

import java.util.*;
public class sort_array {
    public static void sort_ar(int[] b){
        int n=b.length;
        for(int i=1;i<n;i++){
            for(int j=0;j<n-1;j++){
            if(b[j]>=b[j+1]){
                int temp=b[j];
                b[j]=b[j+1];
                b[j+1]=temp;
            }}
        }
        for(int k=0;k<b.length;k++){
            System.out.println(b[k]);
        }


    }
    public static void main(String[]args){
        int[] a={2,7,1,4,5};
        sort_ar(a);
    }
}
