public class add_binary_number {
    public static void main(String[]args){
        String a="011011";
        String b="1010111";
        int carry=0;
        StringBuilder res=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0||j>=0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
            }
            if(sum==0||sum==1){
                res.append(sum);
                carry=0;
            } else if (sum==2) {
                res.append("0");
                carry=1;

            }
            else {
                res.append("1");
                carry=1;
            }
            i--;
            j--;
            if(carry==1){
                res.append("1");
            }
        }
        System.out.println(res.reverse().toString());
    }
}
