import java.util.*;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float pen = sc.nextFloat();
        float pencil = sc.nextFloat();
        float eraser = sc.nextFloat();
        float bill = pen+pencil+eraser;
        System.out.println(bill);
        sc.close();

    }
}
