public class remove_char {
    public static void remove(String s,char c){
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                continue;
            }
            else{
                res+=s.charAt(i);
            }
        }
        System.out.println(res);
    }
    public static void main(String[]args){
        String str="susuki";
        char c='k';
        remove(str,c);
    }
}
