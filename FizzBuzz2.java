import java.util.*;
public class FizzBuzz2 {
    public static void main(String[] args) {
        System.out.println("Enter the Testcase Cycle: ");
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i=0; i<test; i++){
            System.out.println("Enter Your Nmber: ");
            int num = sc.nextInt();
            for( int j=1; j<=num; j++){
                if(j%2==0 && j%6==0){
                    System.out.println("FizzBuzz");
                }else if(j%6==0){
                    System.out.println("Buzz");
                }else if(j%2==0){
                    System.out.println("Fizz");
                }else{
                    System.out.println(j);
                }
            }
        }
    }
}
