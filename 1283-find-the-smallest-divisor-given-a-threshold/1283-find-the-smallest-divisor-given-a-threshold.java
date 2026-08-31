class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l=1;
        int r=Integer.MIN_VALUE;

        for(int n:nums){
            r=Math.max(r,n);
        }

        while(l<=r){
            int mid=l+(r-l)/2;

            long sum=0;
            for(int n:nums){
                sum+=((long)n+mid-1)/mid;
            }

            if(sum<=threshold){
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}