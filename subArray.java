public class subArray {
    public static void printSArray( int num []){
        int ts = 0;
        for(int i=0; i<num.length; i++){
            int start = i;
            for( int j=i; j<num.length; j++){
                int end = j;
                for ( int k=start; k<=end; k++){
                    System.out.print(num[k]+ " ");
                } 
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.print("Total number of sub array :"+ts);

        
    }

    public static void main(String  [] args){
        int num [] = {2,4,6,8,10};
        printSArray(num);
    }
}
