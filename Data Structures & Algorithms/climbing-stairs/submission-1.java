class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int  o =2;
        int t = 1;
        int curr=0;
        for(int i=3;i<=n;i++){
            curr=o+t;
            t=o;
            o=curr;
        }
        return curr;
    }
}
