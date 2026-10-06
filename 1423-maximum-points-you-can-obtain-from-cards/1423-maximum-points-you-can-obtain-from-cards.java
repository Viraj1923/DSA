class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int windowSize = n - k;

        int totalSum = 0;

        for (int card : cardPoints) {
            totalSum += card;
        }

        int windowSum = 0;

        for (int i = 0; i < windowSize; i++) {
            windowSum += cardPoints[i];
        }

        int minWindowSum = windowSum;

        int left = 0;

        for (int right = windowSize; right < n; right++) {

            windowSum -= cardPoints[left];
            windowSum += cardPoints[right];

            left++;

            minWindowSum = Math.min(minWindowSum, windowSum);
        }

        return totalSum - minWindowSum;
    }
}