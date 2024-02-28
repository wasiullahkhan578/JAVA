import java.util.*;
public class sumfn {
    public static void sum(int num1 , int num2){
        int add = num1+num2;
        System.out.println("the addition is  "+ add);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sum(a,b);
    }
}
