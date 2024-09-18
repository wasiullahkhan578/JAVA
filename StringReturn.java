public class StringReturn {
    public static String Average(int arr []){
        int sum = 0;
        for( int i =0; i<arr.length; i++){
            sum += arr[i];
        }
        double ave = (double) sum / arr.length;
        
        return String.format("%.2f", ave);
    }
    
    public static void main (String [] args){
        int arr [] = {1,2,3,4,5};
        System.out.print(Average(arr));
    }
 }