public class palindrome_number {
    public static void main(String[]args){
        int a=12321;
        int org=a;
        int sum=0;
        while(a!=0){
            int rem=a%10;
            sum=(sum*10)+rem;
            a=a/10;
        }
        System.out.println(sum);
        if(org==sum){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
