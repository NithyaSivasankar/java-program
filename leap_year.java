public class leap_year {
    public static void main(String[]args){
       int year=2012;
       if(year%400==0||year%4==0&&year%100!=0){
           System.out.println("leap year");
       }
       else{
           System.out.println("non leap year");
       }
    }
}
