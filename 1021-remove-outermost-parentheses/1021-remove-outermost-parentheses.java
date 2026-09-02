class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        int depth=0;

        for(char ss:s.toCharArray()){
            if(ss=='('){
                if(depth>0){
                    str.append(ss);
                }
                depth++;
            }else if(ss==')'){
                depth--;
                if(depth>0){
                    str.append(ss);
                }
            }
        }
        return str.toString();
    }
}