class Solution {
    public int findNumbers(int[] nums) {
        int count =0 ;
        for(int i = 0 ; i< nums.length ; i++){
            if(getdig(nums[i])%2==0){
                count++;
            }
            

        }
        return count;       
    }
    private int getdig(int x){
        int i =0 ;
        int ct=0;
        int rem;
        while(i<x){
            rem = x%10;
            x/=10;
            ct++;
        }

        return ct;
    }
}