class Solution {
    public int xorOperation(int n, int start) {
         int res = start + 2 * 0;
        
        for (int i = 1; i < n; ++i)
            res = res ^ (start + 2 * i);
    return res;
    }
}