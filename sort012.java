public class sort012 {
    public static void sortColors(int[] nums) {
        int c0=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                c0++;
            }
            if(nums[i]==1){
                c1++;
            }
            if(nums[i]==2){
                c2++;
            }

        }
        for(int i=0;i<c0;i++){
            //System.out.println("0");
            nums[i]=0;
        }
        for(int i=c0;i<c0+c1;i++){
            //System.out.println("1");
            nums[i]=1;
        }
        for(int i=c0+c1;i<c0+c1+c2;i++){
            //System.out.println("2");
            nums[i]=2;
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[]args){
        int[] nums={2,1,0};
        sort012 s=new sort012();
        s.sortColors(nums);
    }
}
