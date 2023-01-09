public class ClearIthBit {

    public static int clearIthBitOperation(int n, int i){
        int bitMask = ~(1<<i);          //11111101
        return n & bitMask;             // 1010 & 1101 = 1000
    }
    public static void main(String args[]){
        int n = 10; //1010
        System.out.println(clearIthBitOperation(n, 1));  //output: 1000 in binary is 8 in decimal
    }
}
