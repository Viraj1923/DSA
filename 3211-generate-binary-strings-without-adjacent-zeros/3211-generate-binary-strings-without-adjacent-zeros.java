class Solution {
    public List<String> validStrings(int n) {
        List<String> result=new ArrayList<>();
        backtrack(new StringBuilder(),n,result);
        return result;
    }

    public static void backtrack(StringBuilder current,int n,List<String> result){
        if(current.length()==n){
            result.add(current.toString());
            return;
        }

        if (current.length() == 0 || current.charAt(current.length() - 1) != '0'){
            current.append("0");
            backtrack(current,n,result);
            current.deleteCharAt(current.length()-1);
        }

        current.append("1");
        backtrack(current,n,result);
        current.deleteCharAt(current.length()-1);

    }
}