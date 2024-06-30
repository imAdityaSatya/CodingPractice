/*
 * Problem 2 : Container With Most Water
 * 
 * Given an array 'height' where height[i] represents the height of a vertical line on the i-th position. 
 * Find two lines, which together with the x-axis forms a container, such that the container contains the most water.
 * 
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The 2 lines with heights 8 and 7 together form the container with the most water, holding 49 water units.
 */

public class ContainerMostWater {
    public static int bruteFunction(int[] height) {
        int maxArea = 0;
        int n = height.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int area = Math.min(height[i], height[j]) * (j - i);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

    public static void main(String args[]){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(bruteFunction(height));
    }
}
