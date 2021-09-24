public class n11 {
    public static int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int max_water = -1;
        while(left < right){
            max_water = Math.max(max_water, Math.abs(left - right) * Math.min(height[left], height[right]));
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_water;
    }
}
