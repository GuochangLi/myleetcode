import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class n15 {
    public static void main(String[] args) {
       
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Map<Integer, Integer> val2index = new HashMap<>();
        Set<List<Integer>> res = new HashSet<>();
        List<List<Integer>> listres = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; ++i){
            val2index.put(nums[i], i);
        }
        for(int i = 0; i < nums.length; ++i){
            for(int j = i + 1; j < nums.length; ++j){
                if(val2index.containsKey(0 - nums[i] - nums[j])){
                    int temp = val2index.get(0 - nums[i] - nums[j]);
                    if(temp > i && temp > j){
                        List<Integer> tripule = new ArrayList<>();
                        tripule.add(nums[i]);
                        tripule.add(nums[j]);
                        tripule.add(0 - nums[i] - nums[j]);
                        res.add(tripule);
                    }
                }
            }
        }
        for (List<Integer> l : res) {
            listres.add(l);
        }
        return listres;
    }
}
