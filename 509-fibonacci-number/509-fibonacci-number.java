class Solution {
    public int fib(int n) {
        if(n==0){
            return n;
        }
        int cache[] = new int[n+1];
        cache[0]=0;
        cache[1]=1;
        for(int i=2;i<=n;i++){
            cache[i]=cache[i-1]+cache[i-2];
        }
        return cache[n];
    }
}