class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int maxLength=0;
        int windowLen=0;
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int right=0;right<fruits.length;right++){
            map.put(fruits[right],map.getOrDefault(fruits[right],0)+1);

            while(map.size()>2){
                if(map.get(fruits[left])==1){
                    map.remove(fruits[left]);
                }else{
                    map.put(fruits[left],map.get(fruits[left])-1);
                }
                left++;
            }
            windowLen=right-left+1;
            maxLength=Math.max(maxLength,windowLen);
        }
        return maxLength;
    }
}