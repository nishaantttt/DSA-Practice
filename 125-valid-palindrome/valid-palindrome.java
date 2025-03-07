class Solution {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++; // Skip non-alphanumeric characters
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--; // Skip non-alphanumeric characters
            }
            
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false; // If mismatch found, not a palindrome
            }
            
            left++;
            right--;
        }
        
        return true;
    }
}
