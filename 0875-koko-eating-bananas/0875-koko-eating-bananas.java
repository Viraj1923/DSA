class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = 0;

        for (int pile : piles) {
            r = Math.max(r, pile);
        }

        while (l <= r) {
            int k = l + (r - l) / 2;

            long hours = 0;
            for (int i = 0; i < piles.length; i++) {
                hours += ((long)piles[i] + k - 1) / k;
            }

            if (hours <= h) {
                r = k - 1;
            } else {
                l = k + 1;
            }
        }
        return l;
    }
}