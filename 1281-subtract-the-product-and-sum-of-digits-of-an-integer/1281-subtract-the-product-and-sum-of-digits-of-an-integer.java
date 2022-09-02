class Solution {
    public int subtractProductAndSum(int num) {
        int product=1;
        int sum=0;
        while(num>0){
            int temp=num%10;
            product*=temp;
            sum+=temp;
            num=num/10;
        }
        return product-sum;
    }
}