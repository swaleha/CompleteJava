/*
 * Friends Pairing Problem: Solved using Recursion
 * Given n friends, each one can remain single or can be paired up with some other friend.
 * Each friend can be paired only once. Find out the total number of ways in which friends 
 * can remain single or can be paired up.
 */

public class FriendsPairingProblem {

    public static int friendsPairing(int n) {
        //Base case
        if(n==1 || n==2){
            return n;
        }

        //choice
        //single
        //int fnm1 = friendsPairing(n-1);

        //pair
        //int fnm2 = friendsPairing(n-2);
        //int totPairs = (n-1) * friendsPairing(n-2); //(n-1) is pair choice; f(n-2) is after 1 pair, applying the same rule for remaining pairs

        //total ways
        //int totWays = fnm1 + fnm2;
        //return totWays;

        return friendsPairing(n-1) + ((n-1) * friendsPairing(n-2));
    }
    public static void main(String[] args) {
        System.out.println(friendsPairing(3));
    }
}
