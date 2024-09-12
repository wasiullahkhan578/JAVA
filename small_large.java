import java.util.*;
public class small_large {
    public static int get_small_large(int number[]){
        int small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        for(int i=0; i<number.length; i++){
            if(small>number[i]){
                small = number[i];
            }
            if(large < number[i]){
                large = number[i];
            }
        }
        System.out.println("Smallest number is :"+small);
        return large;
    }
    public static void main(String[] args) {
        int number[] = {2 ,3 ,90,56,577,0,1};
        System.out.println("Largest number is :"+get_small_large(number));
    }
}
