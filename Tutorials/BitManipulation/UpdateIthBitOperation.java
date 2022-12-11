public class UpdateIthBitOperation{

    public static int clearIthBit(int n, int i){
        int bitMask = ~(1 << i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i){
        n = clearIthBit(n, i);    
        int bitMask = n << i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(updateIthBit(10, 1));
    }
}