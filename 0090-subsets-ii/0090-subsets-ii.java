class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        backtrack(0,new ArrayList<>(),nums,result);
        return result;
    }
    
    public static void backtrack(int index,List<Integer> current,int[] nums,List<List<Integer>> result){
      
        result.add(new ArrayList<>(current));
       

        for(int i=index;i<nums.length;i++){
            if(i>index && nums[i]==nums[i-1]){
                continue;
            }

            current.add(nums[i]);
            backtrack(i+1,current,nums,result);
            current.remove(current.size()-1);
        }
    }
}