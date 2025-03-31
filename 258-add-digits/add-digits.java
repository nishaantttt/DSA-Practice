class Solution {
    public int addDigits(int num) {     
        while(num >= 10) {
            int start = num / 10;
            int end = num % 10;

            num = start + end;
        }

        return num;
    }
}