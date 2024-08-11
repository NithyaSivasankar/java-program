public class decimal_to_binary {
    public static void main(String[]args){
        int n=8;
        String s="";
        while(n!=0){
            int r=n%2;
            s+=r;
            n=n/2;
        }
        for(int i=s.length()-1;i>=0;i--) {
            System.out.print(s.charAt(i));
        }
    }
}
