class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            int num=nums[i];
            int l=1;
            
            if(num>=10000)
            {
                l+=4;
                num/=10000;
            }
            if(num>=100)
            {
                l+=2;
                num/=100;
            }
            if(num>=10)
            {
                l+=1;
                num/=10;
            }
            if(l%2==0)
            {
                count++;
            }
        }
        return count;
        
    }
}