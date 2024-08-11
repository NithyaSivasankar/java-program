public class sum_of_digit {
    public static void main(String[]args){
        int sum=0;
        int a=123;
        while(a>0){
            int rem=a%10;
            sum+=rem;
            a=a/10;
        }
        System.out.println(sum);
    }
}
