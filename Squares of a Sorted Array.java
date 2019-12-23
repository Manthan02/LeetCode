class Solution {
    public int[] sortedSquares(int[] A) {
        
        int l=A.length;
        int[] O=new int[l];
        O[0]=A[0]*A[0];
        int k=0,j=0;
        for(int i=0;i<l;i++)
        {
            int n=A[i]*A[i];
            int f=0;
            for(j=0;j<k;j++)
            {
                if(n<O[j])
                {
                    for(int x=k;x>j;x--)
                    {
                        O[x]=O[x-1];
                    }
                    O[j]=n;
                    j=k;
                    f=1;
                }
            }
            if(f==0)
            {
               O[j]=n; 
            }
            k++;
        }
        return O;
        
    }
}