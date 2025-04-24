class Solution {
    public int countCompleteSubarrays(int[] nums) {
        // Get the number of distinct elements in the entire array
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int distinctCount = set.size();
        
        // Initialize variables for sliding window
        HashMap<Integer, Integer> freq = new HashMap<>();
        int ans = 0;
        int n = nums.length;
        int i = 0;
        
        // Slide the window
        for (int j = 0; j < n; j++) {
            // Add current element to frequency map
            freq.put(nums[j], freq.getOrDefault(nums[j], 0) + 1);
            
            // Shrink window while we have all distinct elements
            while (freq.size() == distinctCount) {
                ans += n - j; // All subarrays from i to j...n are valid
                freq.put(nums[i], freq.get(nums[i]) - 1);
                if (freq.get(nums[i]) == 0) {
                    freq.remove(nums[i]);
                }
                i++;
            }
        }
        
        return ans;
    }
}