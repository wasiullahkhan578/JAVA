import java.util.*;
public class primee {
    public static void main(String[] args) {
        scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==2){
            System.out.println( n "is Prime number");
        }
        else{
            boolean isPrime = true;
            for(int i=2; i<=n-1;i++){
                if(n%i==0){
                    isPrime= false;
                }
            }
            if(isPrime= true){
                System.out.println( "i sprime number");
            }else{
                System.out.println(n "is not a prime number");
            }
        }
    }
}