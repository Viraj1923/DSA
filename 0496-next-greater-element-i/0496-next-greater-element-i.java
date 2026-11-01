class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer> st=new Stack();
        HashMap<Integer,Integer> map=new HashMap<>();
        int result[]=new int[nums1.length];

        for(int current :nums2){
            while(!st.isEmpty() && current>st.peek()){
                int popped=st.pop();
                map.put(popped,current);
            }
            st.push(current);
        }

        for(int i=0;i<nums1.length;i++){
            if(map.containsKey(nums1[i])){
                result[i]=map.get(nums1[i]);
            }else{
                result[i]=-1;
            }
        }
        return result;
    }
}