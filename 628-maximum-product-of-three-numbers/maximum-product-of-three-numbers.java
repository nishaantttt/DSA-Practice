class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length-1;
        return Math.max(nums[n]*nums[n-1]*nums[n-2],nums[0]*nums[1]*nums[n]);
    }
}