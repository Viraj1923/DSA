class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atMost(nums,k)-atMost(nums,k-1);
    }
    public static int atMost(int[] nums, int k) {
        int left=0;
        int count=0;
        int sum=0;
        
        if (k < 0) return 0;
        
        for(int right=0;right<nums.length;right++){
            
            if(nums[right]%2==1){
                sum+=1;
            }else{
                sum+=0;
            }
            

            while(sum>k){
                if(nums[left]%2==1){
                    sum-=1;
                }else{
                    sum-=0;
                }
                left++;
            }
            count+=right-left+1;
        }
        return count;
    }
}