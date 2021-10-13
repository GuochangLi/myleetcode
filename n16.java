public class n16 {
    //O(n^3)
    public static int threeSumClosest(int[] nums, int target) {

        int mindistance = Integer.MAX_VALUE;
        int closeval = 0;

        for(int  i = 0; i < nums.length - 2 ; ++i){
            for(int j = i + 1; j < nums.length - 1; ++j){
                for(int  k = j + 1; k < nums.length; ++k){
                    if(Math.abs(nums[i] + nums[j] + nums[k] - target) < mindistance){
                        mindistance = Math.abs(nums[i] + nums[j] + nums[k] - target);
                        closeval = nums[i] + nums[j] + nums[k];
                    }
                }
            }
        }
        return closeval;
    }
    // O(n^2)
    // public static int threeSumClosest(int[] nums, int target) {

    //     Arrays.sort(nums);
    //     int mindistance = Integer.MAX_VALUE;
    //     int closeval = 0;
    //     int temp = 0;

    //     int pb = 0;
    //     int pc = 0;

    //     for(int  i = 0; i < nums.length - 2 ; ++i){
    //         pb = i + 1;
    //         pc = nums.length - 1;

    //         while(pc != pb){

    //             temp = nums[i] + nums[pb] + nums[pc];
    //             if(Math.abs(temp - target) < mindistance){
    //                 mindistance = Math.abs(temp - target);
    //                 closeval = temp;
    //             }

    //             if(temp >= target){
    //                 pc--;
    //             }
    //             else{
    //                 pb++;
    //             }
    //         }      
    //     }
    //     return closeval;
    // }
}
