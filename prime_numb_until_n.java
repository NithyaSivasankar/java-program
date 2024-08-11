public class prime_numb_until_n {
    public static void main(String[]args){
        int n=15;

        for(int x=2;x<=n;x++){
            boolean isPrime=true;

            for(int y=2;y<=x/2;++y){

                //if(x==y){
                    //continue;
                //}
                if(x%y==0){
                    isPrime=false;
                    break;
                }

            }
            if(isPrime){
                System.out.println(x);
            }
        }
    }
}
