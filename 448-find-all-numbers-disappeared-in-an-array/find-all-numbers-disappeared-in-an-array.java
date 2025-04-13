class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();
        for(int i : nums){
            seen.add(i);
        }
        for(int i = 1 ; i<= nums.length ; i++){
            if(!seen.contains(i)){
                temp.add(i);
            }
        }
        
    return temp;
    }
}