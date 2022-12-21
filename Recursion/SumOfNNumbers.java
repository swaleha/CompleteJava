/*
 * Time complexity : O(n)
 * Space complexity: O(n)
 */
public class SumOfNNumbers {
    public static void main(String[] args) {
        System.out.println(calculateSum(5));
    }

    public static int calculateSum(int n) {
        if(n <= 0){
            System.out.println("Enter a valid number");
            return -1;
        }
        
        if (n == 1) {
            return 1;
        }

        int snm1 = calculateSum(n-1);
        int sn = n + snm1;
        return sn;
    }
}
