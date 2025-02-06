import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
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
        if (digits == null || digits.length() == 0) {
            return result;
        }
        backtrack(digits, 0, new StringBuilder(), result);
        return result;
    }
    
    private void backtrack(String digits, int index, StringBuilder combination, List<String> result) {
        if (index == digits.length()) {
            result.add(combination.toString());
            return;
        }
        char digit = digits.charAt(index);
        String letters = KEYPAD.get(digit);
        if (letters == null) {
            return; 
        }
        
        for (char letter : letters.toCharArray()) {
            combination.append(letter);
            backtrack(digits, index + 1, combination, result);
            combination.deleteCharAt(combination.length() - 1);
        }
    }
}
