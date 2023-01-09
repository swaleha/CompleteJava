public class ModularExponentiation {
    public static int modExpo(int a, int n, int m){
        int ans = 1;
        while(n > 0){

            if((n & 1) != 0){       //check if the LSB in the number n has set bit(i.e 1)
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;           //right shift n by 1
        }
        return ans % m;
    }

    public static void main(String[] args) {
        System.out.println(modExpo(2, 5, 13));
    }
}
