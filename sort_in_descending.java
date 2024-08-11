public class sort_in_descending {
    public static void main(String[]args){
        int[] a={2,3,4,5,1};
        int n=a.length;
        //int maxIndex=0;
        for(int i=0;i<n;i++){
            //int max=a[i];
            for (int j=0;j<n-1-i;j++) {
                if (a[j+1] > a[j]) {
                    int tm = a[j+1];
                    a[j+1] = a[j];
                    a[j] = tm;
                }
            }
        } for(int k=0;k<n;k++) {
            System.out.println(a[k]);
        }
    }
}
