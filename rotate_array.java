public class rotate_array {
    public static void rotat(int[]a,int[] b,int d){
        int k=0;
        for(int i=d;i<a.length;i++){
            b[k]=a[i];
            k++;
        }
        for(int j=0;j<d;j++){
            b[k]=a[j];
            k++;
        }
        for(int m=0;m<a.length;m++){
            System.out.print(b[m]+" ");
        }
    }
    public static void main(String args[]){
        int[] a={1,2,3,4,5,6};
        int[] b=new int[a.length];
        int d=2;
        rotat(a,b,d);
    }
}
