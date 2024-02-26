import java.util.*;
public class WeekDays {
         public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt();
                switch (num){
                case 1 : System.out.println(" It Is Monday.");
                        break;
                case 2 : System.out.println(" It Is Tuesday.");
                        break;
                case 3 : System.out.println(" It Is Wednesday.");
                        break;
                case 4 : System.out.println(" It Is Thursday.");
                        break;
                case 5 : System.out.println(" It Is Friday.");
                        break;
                case 6: System.out.println(" It Is Saturday.");
                        break;
                case 7 : System.out.println("It Is Sunday");
                        break;
                default: System.out.println("wrong day number");
                }
        }
}