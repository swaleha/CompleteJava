public class SetIthBitOperation {

    public static int setIthBit(int n, int i){
        int bitMask = 1<<i; //makes ith bit as 1 and remaining bits as 0 (for i=2, 1<<i = 00000100)
        return n | bitMask;   //(1010 | 00000100 = 1110)
    }

    public static void main(String args[]){
        int n = 10;   //1010 
        System.out.println(setIthBit(n, 2)); // sets the bit in the ith (2) position from 0 to 1
    }
}
