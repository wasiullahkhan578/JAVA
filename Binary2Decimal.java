public class Binary2Decimal {
     public static void bin2dec(int binNum){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;
        while(binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int)Math.pow(2, pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.print("Decimal of " +myNum+" = "+decNum);
     } 
     public static void main(String[] args) {
        bin2dec(1010);
     }
}
