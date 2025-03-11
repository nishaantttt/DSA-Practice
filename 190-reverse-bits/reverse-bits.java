public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;           // Shift result left by 1 to make space for next bit
            result |= (n & 1);       // Add the last bit of n to result
            n >>= 1;                 // Shift n right by 1 to get the next bit
        }
        return result;
    }
}
