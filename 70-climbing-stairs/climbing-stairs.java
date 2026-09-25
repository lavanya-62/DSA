class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int first=1;
        int Second=2;
        for(int i=3;i<=n;i++){
            int current=first+Second;
           first=Second;
            Second=current;
        }
        
        return Second;
    }
}