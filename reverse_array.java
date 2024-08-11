public class reverse_array {
    public static void revarr(int[] b){
        int j=b.length-1;
        int i=0;
        while(i<j){
            int temp=b[i];
            b[i]=b[j];
            b[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<b.length;k++){
            System.out.println(b[k]);
        }
    }
    public static void main(String[]args){
        int[] a={1,2,3,4,5};
        revarr(a);
    }
}
