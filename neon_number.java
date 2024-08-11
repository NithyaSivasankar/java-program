public class neon_number {
    public static void main(String[]args){
        int a=9;
        int sqr=a*a;
        System.out.println(sqr);
        int org=sqr;
        int sum=0;
        while(sqr!=0){
            int rem=sqr%10;
            sum+=rem;
            sqr=sqr/10;
        }
        System.out.println(sum);
        if(a==sum){
            System.out.println("neon");
        }
        else{
            System.out.println("no");
        }

    }
}
