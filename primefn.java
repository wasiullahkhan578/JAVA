public class primefn {
    public static boolean num (int n){
        if(n==2){
            return true;
        }
        boolean isPrime = true;
        for(int i=2; i<=n-1; i++){
            if(n%i==0){
                isPrime = false;
            }
        }
        return isPrime;
    }
    public static void main(String[] args) {
    System.out.println( num(10));
    }
}
