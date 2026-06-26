class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean ans = false;
        Set<Integer> st = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            st.add(nums[i]);
        }
        if(nums.length!=st.size()){
            ans=true;
        }
        return ans;
    }
}