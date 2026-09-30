class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(0,new ArrayList<>(),candidates,target,result);
        return result;
    }

    public static void backtrack(int index,List<Integer> current,int[] candidates,int target,List<List<Integer>> result){
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0){
            return;
        }
        if(candidates.length==index){
            return;
        }

        current.add(candidates[index]);
        backtrack(index, current, candidates, target - candidates[index], result);
        current.remove(current.size()-1);

        backtrack(index + 1, current, candidates, target, result);
        
    }
}