public class largest_ele_in_array {
    public static void main(String[]args){
        int[] a={5,4,1,3};
        int max=a[0];
        for(int i=1;i<a.length;i++) {
            if (max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
