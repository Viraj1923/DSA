class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int l = Integer.MAX_VALUE;
        int r = Integer.MIN_VALUE;

        for (int day : bloomDay) {
            l = Math.min(l, day);
            r = Math.max(r, day);
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;

            int bouquets = 0;
            int flowers = 0;

            for (int day : bloomDay) {
                if (day <= mid) {
                    flowers++;

                    if (flowers == k) {
                        bouquets++;
                        flowers = 0;
                    }
                } else {
                    flowers = 0;
                }
            }

            if (bouquets >= m) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}