class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int l = 1;
        int r = 0;

        for (int weight : weights) {
            r += weight;
        }

        while (l <= r) {

            int mid = l + (r - l) / 2;

            int totalDays = 1;
            int currentWeight = 0;

            for (int weight : weights) {
                if(weight>mid){
                    totalDays=days+1;
                    break;
                }
                if (currentWeight + weight <= mid) {
                    currentWeight += weight;
                } else {
                    totalDays++;
                    currentWeight = weight;
                }
            }

            if (totalDays <= days) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}