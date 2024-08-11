public class count_vowel_conson {
    public static void count(String s,int v,int c) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' ||s.charAt(i) =='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
                v++;

            }
            else{
                c++;
            }
        }
        System.out.println("vowel count"+"="+v+" "+"consonant count"+"="+c);
    }
    public static void main(String[]args){
        String str="aeiou";
        int v=0;
        int c=0;
        count(str,v,c);
    }
}
