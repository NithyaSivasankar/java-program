public class merge_arrays {
    public static int[] merg(int[] a,int[] b,int[] c){
        for(int i=0;i<a.length;i++){
            //for(int k=0;k<a.length;k++){
                c[i]=a[i];
            //}
        }
        for(int j=0;j<b.length;j++){
            //for(int k=a.length;k<b.length;k++){
                c[j+a.length]=b[j];
            }
        //}
        return c;
}
    public static void main(String args[]){
    int[] a={1,2,3};
    int[] b={4,5,6};
    int m=a.length+b.length;
        //System.out.println(m);
    int[] c=new int[m];
    merg(a,b,c);
    for(int l=0;l<c.length;l++){
        System.out.println(c[l]);
    }
}}
