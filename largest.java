public class largest{
    public static void main(String[]args){
        int a=3;
        int b=5;
        int c=1;
        if(a>c&a>b){
            System.out.println("greatest"+a);
        }
        else if(b>a&b>c){
            System.out.println("greatest"+b);
        }
        else{
            System.out.println("greatest"+c);
        }
    }
}
