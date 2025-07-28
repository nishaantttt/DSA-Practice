class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = findBound(nums, target, true);
        int right = findBound(nums, target, false);
        return new int[] {left, right};
    }

    // Helper function for binary search
    private int findBound(int[] nums, int target, boolean isLeft) {
        int left = 0, right = nums.length - 1;
        int bound = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                bound = mid;
                if (isLeft) {
                    right = mid - 1;  // Search left part
                } else {
                    left = mid + 1;   // Search right part
                }
            }
        }
        return bound;
    }
}
