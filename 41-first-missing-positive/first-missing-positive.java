class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
for (int i = 0; i <nums.length; i++) {
    int element = nums[i];
    
    if (element >= 1 && element <= n) {
        int chair = element - 1;
        if (nums[chair] != element) {
            int temp = nums[chair];
                    nums[chair] = nums[i];
                    nums[i] = temp;
                    i--;
            
        }
    }
}

for (int i = 0; i < nums.length; i++) {
    if (i + 1 != nums[i]) return i + 1;
}

return n + 1;
    }
}