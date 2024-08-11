public class seperate_negative_positive_num {
    public static int[] arrange(int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                continue;
            } else {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[j] < 0) {
                        int temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    } else {
                        j++;
                    }
                }
            }
        }
        return a;
    }
    public static void main(String[] args){
        int a[]={-1,2,0,-2,-3};

        arrange(a);
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
