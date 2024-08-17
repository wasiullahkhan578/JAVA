import java.util.*;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press A");
        int a = sc.nextInt();
        System.out.println("Press B");
        int b = sc.nextInt();
        System.out.println("Press Operator");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+': System.out.println(a+b);                
                break;
            case '-': System.out.println(a-b);
                break;
            case '*': System.out.println(a*b);
                break;
            case '/': System.out.println(a/b);
                break;
            case '%': System.out.println(a%b);
                break;
            default: System.out.println("you entered Wrong Operator");
                break;
        }
        sc.close();
    }

}
