/*
 * Problem 2 : Container With Most Water
 * 
 * You are given an array height where height[i] represents the height of a vertical line on the i-th position. 
 * Find two lines, which together with the x-axis forms a container, such that the container contains the most water.
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with the x-axis forms a container, such that the container contains the most water.
 * 
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The two lines with height 8 and 7 together form the container with the most water, which can hold 49 units of water.
 */

public class Problem02 {
    public static int containerWithMostWater(int[] height) {
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

    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println(containerWithMostWater(height));
    }
}
