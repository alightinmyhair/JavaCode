import java.util.HashMap;
import java.util.Map;

//Given an array of integers nums and an integer target
//return indices of the two numbers such that they add up to target.

class Solution {
    //Time: O(n), will potentially look at each element at least once
    //Space: O(n)
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i =0; i < nums.length; i++) {
            int currentValue = nums[i];
            //x = target - currentValue
            int x = target - currentValue;

            if (map.containsKey(x)) {
                return new int[] { map.get(x), i};
            }
            map.put(currentValue, i);
        }
        //I need to return something 
        //compiler satisfaction line
        return null;
        
    }
}