import java.util.*;
public class TwoDQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int numbers [] [] = new int [rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        //output
        for(int i =0; i<numbers.length; i++){
            for(int j = 0; j<numbers.length; j++){
                if(numbers[i][j]==x){
                    System.out.println("x is found at "+i+","+j);
                }
            }
        }
        sc.close();

    }

}
