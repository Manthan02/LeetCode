class Solution {
    public int subtractProductAndSum(int n) {
        int sum=0,mul=1;
        while(n>0)
        {
            int x=n%10;
            n/=10;
            
            sum+=x;
            mul*=x;
            
        }
        return mul-sum;
    }
}