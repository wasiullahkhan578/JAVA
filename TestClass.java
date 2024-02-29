import java.util.*;
class TestClass {
    public static void main(String args[] ){
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for(int t=0; t<T; t++){
            int N = scanner.nextInt();
            for( int i=1; i<=N; i++){
                if(i%3==0 && i%5==0){
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
        scanner.close();
    }
}
