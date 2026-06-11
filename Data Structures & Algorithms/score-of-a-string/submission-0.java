class Solution {
    public int scoreOfString(String s) {
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            char current=s.charAt(i);
            char next=s.charAt(i+1);
            sum+=Math.abs(next-current);
        }
        return sum;
    }
}