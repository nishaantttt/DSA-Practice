class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        
        // Start with the first term
        String result = "1";
        
        // Generate each term from 2 to n
        for (int i = 2; i <= n; i++) {
            StringBuilder current = new StringBuilder();
            int count = 1;
            char digit = result.charAt(0);
            
            // Iterate through the previous term
            for (int j = 1; j < result.length(); j++) {
                if (result.charAt(j) == digit) {
                    // If current digit is same as previous, increment count
                    count++;
                } else {
                    // Append count and digit to current term
                    current.append(count).append(digit);
                    digit = result.charAt(j);
                    count = 1;
                }
            }
            // Append the last group of digits
            current.append(count).append(digit);
            result = current.toString();
        }
        
        return result;
    }
}
