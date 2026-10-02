class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(1,new ArrayList<>(),k,n,result);
        return result;
    }

    public static void backtrack(int index,List<Integer> current,int k,int n,List<List<Integer>> result){
        if (current.size() == k) {
            if (n == 0) {
                result.add(new ArrayList<>(current));
            }
            return;
        }
        if(current.size()==k && n!=0){
            return;
        }
        if(n<0){
            return;
        }
        for(int i=index;i<=9;i++){
            current.add(i);
            backtrack(i+1,current,k,n-i,result);
            current.remove(current.size()-1);
        }
    }
}