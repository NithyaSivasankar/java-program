import java.util.*;
public class count_of_given_string {
    public static void chechcount(String s,char c){
        //HashMap<Character,Integer> map=new HashMap<>();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        System.out.println(c+"-"+count);
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter char");
        char ch=sc.next().charAt(0);
        System.out.println("enter string");
        String str=sc.next();
        chechcount(str,ch);
        // char ch=sc.nextLine();
    }
}
