class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
        List<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }


        for (int num : map.keySet()) {
            if (map.get(num) > n / 3) {
                list.add(num);
            }
        }
        return list;
    }
}