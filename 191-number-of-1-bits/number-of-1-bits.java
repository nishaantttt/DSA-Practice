class Solution {
    public int hammingWeight(int n) {
        String a = Integer.toBinaryString(n);
        int ct=0;
        for(int i = 0 ; i <a.length() ; i++ ){
            if(a.charAt(i)=='1'){
                ct++;
            }
        }
        return ct;
    }
}