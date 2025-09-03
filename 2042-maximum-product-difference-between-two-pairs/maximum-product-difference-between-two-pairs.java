class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int a=1;
        int b = 1;
        for(int i = nums.length-1 ; i>nums.length-3 ; i--){
            a*=nums[i];
        }
        for(int i = 0 ;i<2 ; i++){
            b*=nums[i];
        }
        return a-b;
    }
}