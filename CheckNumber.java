import java.util.*;
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String check = (num<0)? "Negative": "Positive";
        System.out.println(check);
        sc.close();
    }
}
