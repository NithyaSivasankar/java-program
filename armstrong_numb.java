public class armstrong_numb {
    public static void main(String[]args){
        int a=153;
        int org=a;
        int sum=0;
        while(a>0){
            int rem=a%10;
            sum+=rem*rem*rem;
            a=a/10;
        }
        if(org==sum){
            System.out.println("t");
        }
        else{
            System.out.println("f");
        }
    }
}
