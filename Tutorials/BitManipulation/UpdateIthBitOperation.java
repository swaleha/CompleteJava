public class UpdateIthBitOperation{

    public static int clearIthBit(int n, i){
        int bitMask = 1 << i;
        
    }

    public static int updateIthBit(int n, int i){
        int n = clearIthBit(n, i);    
        int bitMask = n << i;
        return n | bitMask;
    }
    public static void main(String[] args) {
        
    }
}