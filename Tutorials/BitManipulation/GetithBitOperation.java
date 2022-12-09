public class GetithBitOperation {

    public static int getIthBit(int n, int i){
        int bitMask = 1 << i; //keeps the ith bit as 1 and makes remaining bits as 0 (for i=2, 1<<i = 00000100)
        if((n & bitMask) == 0){ // ith bit is 0
            return 0;
        } else {              //ith bit is 1
            return 1;
        }
    }
    public static void main(String args[]){
        int n = 10;
        System.out.println(getIthBit(n, 3)); //2 // gets the bit value from the ith (2) position
    }
}
