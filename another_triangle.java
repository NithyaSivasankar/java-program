public class another_triangle {
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <=n; j++) {
                if(j==i||i==n||i==1)
                  System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int j = i; j <n; j++) {
                if(i==n||i==1||j==n-1)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i=1;i<5;i++) {
            for (int j = i; j <n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i+1; j++) {
                if(j==1||i==n-1)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                if(i==n-1||j==i)
                System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
