import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    // Mapping from digit to letters.
    private static final Map<Character, String> KEYPAD = new HashMap<>();
    
    static {
        KEYPAD.put('2', "abc");
        KEYPAD.put('3', "def");
        KEYPAD.put('4', "ghi");
        KEYPAD.put('5', "jkl");
        KEYPAD.put('6', "mno");
        KEYPAD.put('7', "pqrs");
        KEYPAD.put('8', "tuv");
        KEYPAD.put('9', "wxyz");
    }
    
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        // Edge case: if digits is null or empty, return an empty list.
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }
    
    private void backtrack(String digits, int index, StringBuilder combination, List<String> result) {
        // Base case: if we've reached the end of the digit string, add the combination.
        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }
        
        char digit = digits.charAt(index);
        String letters = KEYPAD.get(digit);
        if (letters == null) {
            return; // Skip invalid digits (if any).
        }
        
        // For each letter corresponding to the current digit, append it and proceed.
        for (char letter : letters.toCharArray()) {
            combination.append(letter);
            backtrack(digits, index + 1, combination, result);
            combination.deleteCharAt(combination.length() - 1); // Backtrack.
        }
    }
}
