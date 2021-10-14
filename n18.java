public class n18 {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        List<List<Integer>> output = new ArrayList<>();
        Map<Integer, Integer> nummap = new HashMap<>();
        int purpose = 0;
        for(int i =0; i < nums.length; ++i){
            nummap.put(nums[i], i);
        }        
        for(int pa = 0; pa < nums.length - 3 ; ++pa){
            if(pa > 0 && nums[pa - 1] == nums[pa]){
                continue;
            }
            for(int pb = pa + 1; pb < nums.length - 2 ; ++pb){
                if(pb > pa + 1 && nums[pb - 1] == nums[pb]){
                    continue;
                }
                for(int pc = pb + 1; pc < nums.length - 1 ; ++pc){
                    if(pc > pb + 1 && nums[pc - 1] == nums[pc]){
                        continue;
                    }
                    purpose = target - nums[pa] - nums[pb] - nums[pc];
                    if(nummap.containsKey(purpose) &&  nummap.get(purpose) > pc){
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[pa]);
                        l.add(nums[pb]);
                        l.add(nums[pc]);
                        l.add(purpose);
                        output.add(l);
                    }
                }
            }
            
            
        }
        return output;
    }
}
