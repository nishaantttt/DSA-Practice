public class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;  // Move both pointers when characters match
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;  // Allow long press (repeated character in typed)
                continue;
            } else {
                return false;  // Invalid sequence
            }
            j++;
        }
        
        return i == name.length(); // Ensure all characters in name are used
    }
}
