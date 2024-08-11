public class compound_interest {
    public static void main(String[]args){
        int p=1200;
        double r=5.4;
        int t=2;
        double ci=p*(Math.pow((1+r/100),t));
        System.out.println(ci);
    }
}
