import java.util.*;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        // Frequency map to count occurrences of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        
        // Count frequencies
        for (char c : s.toCharArray()) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }
        
        // Get the frequency of the first character
        int freq = freqMap.values().iterator().next();
        
        // Check if all frequencies are the same
        for (int count : freqMap.values()) {
            if (count != freq) {
                return false;
            }
        }
        
        return true;
    }
}
