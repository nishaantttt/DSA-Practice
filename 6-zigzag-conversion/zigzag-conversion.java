class Solution {
    public String convert(String s, int n) {
        if (n == 1 || s.length() <= n) {
            return s;
        }

        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "";
        }

        int a = 0;
        int down = 1;

        for (int i = 0; i < s.length(); i++) {
            arr[a] += s.charAt(i);

            if (down == 1) {
                a++;
                if (a == n) {
                    a = n - 2;
                    down = 0;
                }
            } else {
                a--;
                if (a < 0) {
                    a = 1;
                    down = 1;
                }
            }
        }

        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i];
        }

        return ans;
    }
}