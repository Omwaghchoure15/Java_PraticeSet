public class Patterns {
    public static void main(String[] args) {
        //p1();
        p2();
    }
    public static void p1(){
        for (int i = 1 ; i <= 4 ;i++){
            for (int j = 0 ;j <= 4  ;j++){
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
    public static void p2(){
        int n = 5;
        int m = 4;
        for (int i = 0 ; i <= n ;i++){
            for (int j = 0 ;j <= m  ;j++){
                if ( i==1 || j==1 || i==n || j==m ){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
