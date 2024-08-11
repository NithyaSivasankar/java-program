public class hcf {
    public static int gcd(int x,int y){
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
    public static void main(String[]args){
        int x=6;
        int y=3;
        System.out.println(gcd(x,y));
    }
}
