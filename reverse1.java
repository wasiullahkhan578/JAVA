import java.util.*;
public class reverse1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int rev = 0;
        while(num>0){
            int lastDigit =num%10;
            rev = (rev*10)+lastDigit;
            num = num/10;
        }
        System.out.println(rev);
        sc.close();

    }

}
