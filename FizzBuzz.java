import java.util.*;
public class FizzBuzz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for( int j=0; j<test; j++){
            int num = sc.nextInt();
            for(int i=1; i<=num; i++){
                if(i%5==0 && i%3==0){
                    System.out.println("FizzBuzz");
                }else if(i%5==0){
                    System.out.println("Buzz");
                }else if(i%3==0){
                    System.out.println("Fizz");
                }else{
                    System.out.println(i);
                }
            }
        }
    }
}