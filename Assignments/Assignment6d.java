import java.util.*;
public class Assignment6d {

    public static int calculateTrappedWater(int height[]){
        int n = height.length;

        //calculate maximum value on the left side of the bar
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        //calculate maximum value on the right of the bar
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        } 

        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int water_level = Math.min(leftMax[i], rightMax[i]);
            trappedWater += water_level - height[i];
        }
        return trappedWater;
    }
    public static void main(String args[]){
        int height[] = {0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(calculateTrappedWater(height));
    }
}
