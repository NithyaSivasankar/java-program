public class remove_all_occurence_ele_in_array {
    public static void remove_all(int[]a,int[]b){
        for(int i=0;i<a.length;i++){
            b[i]=a[i];
        }
        for(int k=0;k<b.length;k++){
            System.out.println(b[k]);
        }
    }
    public static void main(String args[]){
        int a[]={2,3,4,5};
        int b[]=new int[a.length];
        remove_all(a,b);
        /*for(int k=0;k<b.length;k++){
            System.out.println(b[k]);
        }*/
    }
}
