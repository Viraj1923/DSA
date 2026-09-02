class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder s=new StringBuilder();
        s.append(strs[0]);

        for(int i=1;i<strs.length;i++){
            String checkWord=strs[i];

            while(!checkWord.startsWith(s.toString())){
                s.deleteCharAt(s.length() - 1);
            }
        }

        return s.toString();
    }
}