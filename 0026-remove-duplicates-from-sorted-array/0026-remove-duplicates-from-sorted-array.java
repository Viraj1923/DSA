class Solution {
    public int removeDuplicates(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int i = 0; 
        for (int j = 1; j < n; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j]; // place next unique element
            }
        }
        // Optional: Fill the rest with 0 for clarity
        for (int k = i + 1; k < n; k++) {
            arr[k] = 0;
        }
        return i + 1;
    }
}