public class invertedPyramid {
    public static void Inverted_Pyramid( int n){
        //outer loop
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Inverted_Pyramid(5);
    }
}
