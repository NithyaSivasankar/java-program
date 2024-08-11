public class armstrong_between_two_integer {
    public static void main(String[]args){
    int i=100;
    int n=160;

    for(int x=i;x<=n; x++){
        int org=x;
        int sum=0;
        int temp=x;
        while(temp!=0){
            int rem=temp%10;
            sum+=rem*rem*rem;
            temp=temp/10;
        }
        if(org==sum){
            System.out.println(org);
        }
    }
}}
