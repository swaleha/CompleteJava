public class FastExponentiation {
    public static int fastExpo(int a, int n){
        int ans = 1;

        while(n > 0){
            if((n & 1) != 0){   //check set bit in the LSB
                ans = ans * a;
            }

            a = a * a;           //multiple of 2 
            n = n>>1;           //shifts n to the right by 1 bit

        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(fastExpo(5, 4));
    }
}
