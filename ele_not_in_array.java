public class ele_not_in_array {
    public static void main(String[]args){
        int[] a={1,2,3,4,5};
        int[] b={2,3,0,4};
        for(int i=0;i<a.length;i++){
            int fla=0;
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    fla++;
                }

            }
            if(fla==0){
                System.out.println(a[i]);
            }
        }
    }
}
