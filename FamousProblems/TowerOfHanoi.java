/*
 * Tower of Hanoi:
 * You have 3 towers and N disks of different sizes which can slide onto any tower.
 * The puzzle starts with disks sorted in ascending order in size from top to bottom.
 * (i.e each disk sits on top of a larger one)
 *
 * Following are the constraints:
 * 1. Only one disk can be moved at a time
 * 2. A disk can be moved from top of one tower to another
 * 3. Large disk cannot be placed on top of a small disk
 *
 * Write a program to move disks from first tower to the last by stacking
 */
public class TowerOfHanoi {

    public static void towerOfHanoifunction(int n, String src, String helper, String dest) {
        if(n == 1) {
            System.out.println("transfer disk " + n + " from " + src + " to " + dest);
            return;
        }

        //transfer top n-1 from src to helper using dest as 'helper'
        towerOfHanoifunction(n-1, src, dest, helper);

        //transfer last disk/nth disk from src to dest
        System.out.println("transfer disk " + n + " from " + src + " to " + helper);

        //transfer n-1 disks from helper to dest using src as 'helper'
        towerOfHanoifunction(n-1, helper, src, dest);
    }
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoifunction(n, "A", "B", "C");
    }
}
