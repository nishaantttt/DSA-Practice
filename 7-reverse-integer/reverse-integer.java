class Solution {
    public int reverse(int n) {
        int rev =0;
        int rem;
        while(n!=0){
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }
            rem=n%10;
            rev=rev*10+rem;
            n/=10;
        }
        return rev;
    }
}