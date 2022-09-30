class Solution {
    public int climbStairs(int n) {
        int cache[] = new int[n+1];
        if(n==1){
            return n;
        }
        cache[1]=1;
        cache[2]=2;
        for(int i=3;i<=n;i++){
            cache[i]=cache[i-1]+cache[i-2];
        }
        return cache[n];
    }
}