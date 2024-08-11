public class find_character_in_string {
    public static char find(String s,int ind){
        char ch=' ';
        for(int i=0;i<s.length();i++){
            if(i==ind){
                ch=s.charAt(i);
            }
        }
        return ch;
    }
    public static void main(String args[]){
        String s="geeks";
        int ind=2;
        System.out.println(find(s,ind));
    }
}
