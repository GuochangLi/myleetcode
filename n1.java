import java.util.HashMap;
import java.util.Map;
/*
    @author:lgc
    @data:2020.12.21
    @question:两数之和
*/
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> arrays = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; ++i){
            arrays.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; ++i){
            //保证一个数字不能被重复计入
            if(arrays.containsKey(target - nums[i]) && arrays.get(target - nums[i]) != i){
                return new int[]{i, arrays.get(target - nums[i])};
            }
        }
        return new int[0];
    }
    /*another answer
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> arrays = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; ++i){
            if(arrays.containsKey(target - nums[i])){
                return new int[]{i, arrays.get(target - nums[i])};
            }
            arrays.put(nums[i], i);
        }
        return new int[0];
    }
    */
}