import java.util.*;
public class fuzzbuzz2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your number: ");
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
        sc.close();
    }
}
