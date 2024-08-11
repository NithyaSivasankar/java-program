public class max_min_array {
    public static void max_min(int[] b){
        int min=b[0];
        int max=b[b.length-1];
        for(int i=0;i<b.length;i++){
            if(b[i]>max){
                max=b[i];
            }
        }
        for(int j=0;j<b.length;j++){
            if(b[j]<min){
                min=b[j];
            }
        }
        System.out.println("max"+max+"min"+min);
    }
    public static void main(String[]args){
        int[] a={2,3,1,8,6,9};
        max_min(a);
    }
}
