public class recursively_linear_search {
    public static int recurs(int[] a,int tar,int l,int r) {
        if(r<l){
            return -1;
        } else if (a[l]==tar) {
            return l;

        }
        else if(a[r]==tar){
            return r;
        }
        return recurs(a,tar,l+1,r-1);
    }
    public static void main(String[]args){
        int[] a={3,2,5,9,1};
        int tar=5;
        int l=0;
        int r=a.length-1;
        int index=recurs(a,tar,l,r);
        if(index!=0){
            System.out.println(index);
        }
        else{
            System.out.println("not found");
        }
    }
}
