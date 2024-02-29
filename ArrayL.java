import java.util.*;
public class ArrayL {
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            if(largest<numbers[i]){
                largest=numbers[i];
            }
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        System.out.println("The Smallest Number IN tHE aRRAYS is "+smallest);
        return largest;
    }
    public static void main(String[] args) {
        int numbers[]= {1,2,3,4,9,87,0};
        System.out.println ("The Largest No. Of The Array is " + getLargest(numbers));
    }
}
