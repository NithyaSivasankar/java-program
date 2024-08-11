public class add_two_complex {
    int real,image;
    add_two_complex(int r,int i){
        this.real=r;
        this.image=i;
    }
    public void show(){
        System.out.println(this.real+"+i"+this.image);
    }
    public static add_two_complex add(add_two_complex t1,add_two_complex t2) {
        add_two_complex res = new add_two_complex(0, 0);
        res.real = t1.real + t2.real;
        res.image = t1.image + t2.image;
        return res;
    }
    public static void main(String[]args){
        add_two_complex t1=new add_two_complex(2,3);
        add_two_complex t2=new add_two_complex(3,4);
        System.out.println("first no1:");
        t1.show();
        System.out.println("second no2:");
        t2.show();
        add_two_complex res=add(t1,t2);
        System.out.println("add is:");
        res.show();
    }
}
