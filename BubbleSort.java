public class BubbleSort{
    public static void BubbleS( int arr []){
        for(int turn = 0; turn<arr.length; turn++){
            for (int i=0; i<arr.length -1-turn; i++){
                if( arr[i]> arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    public static void PrintArr(int arr []) {
        for( int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        int arr [] = {5,4,1,3,2,};
        BubbleS(arr);
        PrintArr(arr);
    }
}