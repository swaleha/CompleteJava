import javax.naming.spi.DirStateFactory.Result;

/*
 * Using recursion, find all continguous occurrences of substrings of a string S that start and end with the same character
 * For example, for a string s = 'aba', 4 substrings fit the above mentioned criteria:
 * They are: a, b, a and aba.
 */
public class Practice12d {
    public static int subStr(String str, int i, int j, int n) {
        //Base case
        if(n == 1) {
            return 1;
        }

        if(n <= 0) {
            return 0;
        }

        //Work
        int result = subStr(str, i + 1, j, n - 1) +
                    subStr(str, i, j - 1, n - 1) -
                    subStr(str, i + 1, j - 1, n - 2);

        if(str.charAt(i) == str.charAt(j)) {
            result++;
        }

        return result;
    }
    public static void main(String[] args) {
        String str = "abcab";
        int n = str.length();
        System.out.println(subStr(str, 0, n-1, n));

    }
}
