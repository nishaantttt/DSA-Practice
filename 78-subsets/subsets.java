class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<>()); // Start with empty subset

        for (int i = 0; i < nums.length; i++) {
            int currentSize = result.size();
            for (int j = 0; j < currentSize; j++) {
                List<Integer> subset = new ArrayList<>(result.get(j)); // Copy existing subset
                subset.add(nums[i]); // Add current number
                result.add(subset); // Add new subset to result
            }
        }

        return result;
    }
}
