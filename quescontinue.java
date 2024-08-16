import java.util.*;
public class quescontinue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter Your Number..");
            int i = sc.nextInt();
            sc.close();

            if( i % 10 == 0){
                continue;
            } System.out.println(i);
        } while(true);
        
    }
}