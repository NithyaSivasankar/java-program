public class fibonacci_series {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if (n == 1||n==2) {
            return 1;
        }
        return fibo(n-2)+fibo(n-1);
    }
    public static void main(String[]args){
        int n=4;
        int sum=0;
        for(int i=0;i<=2*n;i++){
            if(i%2==0) {
                sum+=fibo(i);
            }
        }
        System.out.println(sum);
}
}
