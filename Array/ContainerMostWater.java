/*
 * Problem 2 : Container With Most Water
 * 
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
 * The n vertical lines are drawn such that the two endpoints of line i are at (i, ai) and (i, 0). 
 * Find two lines, which together with the x-axis forms a container, such that the container contains the most water.
 *
 * Given an array 'height' where height[i] represents the height of a vertical line on the i-th position. 
 * Find two lines, which together with the x-axis forms a container, such that the container contains the most water.
 * 
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The 2 lines with heights 8 and 7 together form the container with the most water, holding 49 water units.
 */

 public class ContainerMostWater {
    public static int bruteFunction(int height[]) {
        int maxArea = 0;
        int n = height.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int area = Math.min(height[i], height[j]) * (j-i);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public static int optFunction(int height[]) {
        int maxArea = 0;
        int left = 0;
        int right = (height.length)-1;
        while(left < right) {
            int area = Math.min(height[left], height[right]) * (right-left);
            maxArea = Math.max(maxArea, area);
            if(height[left] < height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return maxArea;
    }

    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        // System.out.println(bruteFunction(height));
        System.out.println(optFunction(height));

    }
    
}

