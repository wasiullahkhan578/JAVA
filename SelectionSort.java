public class SelectionSort {
    public static void selectionS (int arr []){
        for( int i=0; i<arr.length-1; i++){
            int minPose = i;
            for( int j=i+1; j<arr.length; j++){
                if(arr[minPose]> arr[j]){
                    minPose = j;
                }
            }
            int temp = arr[minPose];
            arr[minPose] = arr[i];
            arr[i] = temp; 
        }
    }
    public static void printArr(int arr []){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr [] = {5,4,1,3,2};
        selectionS(arr);
        printArr(arr);
    }
}
