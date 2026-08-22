class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        int element=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int i:nums){
            if(map.get(i)>n/2){
                element=i;
            }
        }
        return element;
    }
}