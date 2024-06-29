import java.util.HashMap;
import java.util.Map;

/**
 * Problem 1 : Two Sum
 * 
 * Given an array of integers 'arr' and an integer 'target'. Return the indices of two numbers such that they sum up to target.
 * Assume that each input would have exactly one solution, and do not use the same element twice.
 * 
 * Sample Input: arr = [2,7,11,15], target = 9
 * Sample Output: [0,1]
 */

public class TwoSum {
    
    public static void bruteFunction1(int arr[], int target){
        int numOne=0, numTwo=0;
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(target == arr[i]+arr[j]){
                    numOne = i;
                    numTwo = j;
                }
            }
        }
        int res[] = {numOne, numTwo};
        for(int i=0; i<2; i++){
            System.out.print(res[i]+" ");
        }
    } 

    public static int[] bruteFunction2(int arr[], int target){
        int res[] = new int[2];
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(target == arr[i]+arr[j]){
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    } 

    public static int[] optFunction(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i<arr.length; i++) {
            int complement = target - arr[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(arr[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }   

    public static void main(String[] args) {
        int arr[] = {2,7,11,15};
        int target = 9;
        
        // bruteFunction1(arr, target);

        // System.out.println(bruteFunction2(arr, target));    // printing [I@5acf9800

        // int ans[] = bruteFunction2(arr, target);
        // for(int i=0; i<2; i++){
        //     System.out.print(ans[i]+" ");
        // }
        
        int ans[] = optFunction(arr, target);
        for(int i=0; i<2; i++){
            System.out.print(ans[i]+" ");
        }

    }

}
