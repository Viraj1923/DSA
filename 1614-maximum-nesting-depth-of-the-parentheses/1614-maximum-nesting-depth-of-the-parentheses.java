class Solution {
    public int maxDepth(String s) {
        int maxD=0;
        int depth=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='('){
                depth++;
                maxD=Math.max(depth,maxD);
            }else if(ch==')'){
                depth--;
            }
        }
        return maxD;
    }
}