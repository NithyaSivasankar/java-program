public class replace_character {
    public static String replac(String s,int ind,char c){
        //char ch=' ';
        String st="";
        for(int i=0;i<s.length();i++){
            if(i==ind){
                st+=c;
            }
            else {
                st+=s.charAt(i);
            }
        }
        return st;
    }
    public static void main(String args[]){
        String s="geeks";
        int ind=2;
        char c='a';
        System.out.println(replac(s,ind,c));
    }
}
