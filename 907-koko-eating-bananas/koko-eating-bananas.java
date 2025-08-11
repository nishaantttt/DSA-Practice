class Solution {

    // Find maximum pile size
    public static int maxi(int[] arr) {
        int maxi = Integer.MIN_VALUE;
        for (int num : arr) {
            maxi = Math.max(maxi, num);
        }
        return maxi;
    }

    // Calculate total hours needed for given speed
    public static int hrs(int[] arr, int speed) {
        int th = 0;
        for (int i : arr) {
            th += Math.ceil((double) i / (double) speed);
        }
        return th;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = maxi(piles);

        while (low <= high) {
            int mid = (low + high) / 2;
            int totalh = hrs(piles, mid);

            if (totalh <= h) {
                // Speed works, try slower
                high = mid - 1;
            } else {
                // Too slow, try faster
                low = mid + 1;
            }
        }
        return low; // 'low' will be the minimum speed
    }
}
