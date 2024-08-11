public class longest_string_in_sentence {
    public static String longword(String s){
        String[] st=s.split(" ");
        String lng="";
        for(String wo:st){
            int max=0;
            if(max<wo.length()){
                 lng=wo;
            }

        }
        return lng;
    }
    public static void main(String[]args){
        String str="java is oop language";
        System.out.println(longword(str));
    }
}
