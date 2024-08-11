public class prime_number {
    public static void main(String[]args){
        int n=11;
        int flag=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag=1;
            }

        }
        if(flag==0){
            System.out.println("prime");
        }
    }
}
