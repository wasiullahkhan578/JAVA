public class binarySearch {
    public static int BSearch(int num[], int key){
        int start = 0, end = num.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(num[mid]==key){
                return mid;
            }
            if(num[mid]< key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int num [] = {2,3,4,5,6,7,8,9,0};
        int key = 9;
        System.out.println("Index for your key is : "+ BSearch( num, key));
    }
}
