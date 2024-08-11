public class palindrome_or_not {
    public static void main(String[]args){
        String s="madam";
        int l=0;
        int r=s.length()-1;
        boolean b=true;
        while (l<r){
            if(s.charAt(l)!=s.charAt(r)){
                b=false;
            }
            l++;
            r--;
        }
        System.out.println(b);
    }
}
