import java.util.*;
public class trianle {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The Pattern Is: ");
        int n = sc.nextInt();
        for (int i=1; i<=n; n++){
            for(int j=1; j=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
