class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0;          // fill from start
        int right = n - 1;     // fill from end

        for (int x : nums) {
            if (x % 2 == 0) {
                result[left++] = x;   // even → front
            } else {
                result[right--] = x;  // odd → back
            }
        }

        return result;
    }
}