class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int i=0;
        int j=0;
        HashSet<Integer> set = new HashSet<>();
        long maxSum = 0;
        long sum = 0;
        while(j<nums.length){
            sum+=nums[j];
            while(set.contains(nums[j])){
                sum-=nums[i];
                set.remove(nums[i]);
                i++;
            }
            set.add(nums[j]);
            if(set.size() == k){
                maxSum = Math.max(sum , maxSum);
                sum -= nums[i];
                set.remove(nums[i]);
                i++;
            }
            j++;
        }
        return maxSum;
    }
}