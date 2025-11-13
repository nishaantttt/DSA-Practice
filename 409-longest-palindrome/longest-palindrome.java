import java.util.HashMap;

public class Solution {  
    public int longestPalindrome(String s) {

        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        int length = 0;
        boolean hasOdd = false;

        for (int val : freq.values()) {
            if (val % 2 == 0) {
                length += val;
            } else {
                length += val - 1;   // use the even part
                hasOdd = true;
            }
        }

        return hasOdd ? length + 1 : length;
    }
}
