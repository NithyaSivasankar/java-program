import javax.swing.*;

public class search_an_elem_in_array {
    public static void main(String[]args){
        int[] a={2,3,5,6,7};
        int l=0;
        int r=a.length-1;
        //int mid=0;
        int target=3;
        int an=0;
        while(l<=r) {
            int mid = (l + r) / 2;
            if (a[mid] == target) {
               an=a[mid];
               break;
            }
            else if (a[mid] < target) {
                l = mid + 1;
            } else  {
                r = mid - 1;
            }

        }
        if(target==an){
            System.out.println("t");
        }
        else{
            System.out.println("f");
        }
    }
}
