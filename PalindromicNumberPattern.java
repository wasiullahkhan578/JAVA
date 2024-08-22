public class PalindromicNumberPattern {
    public static void palindromicP(int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for( int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //dec number
            for(int j=i; j>=1; j--){
                System.out.print(j);
            }
            //asc number
            for(int j=2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();

        }
    }
    public static void main(String[] args) {
        palindromicP(5);
    }
}
