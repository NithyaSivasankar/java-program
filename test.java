public class test {
    static int i=10;
    public void m(){
        System.out.println(i);
    }

    public static void main(String[]args){
        test t1=new test();
        System.out.println("test");
        t1.m();
    }
}
