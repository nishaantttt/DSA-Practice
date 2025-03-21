class Solution {
    // Function to find the sum of squares of digits
    public static int sumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

    // Function to check if a number is happy
    public static boolean isHappy(int n) {
        HashSet<Integer> seenNumbers = new HashSet<>();
        while (n != 1 && !seenNumbers.contains(n)) {
            seenNumbers.add(n);
            n = sumOfSquares(n);
        }
        return n == 1;
    }
}