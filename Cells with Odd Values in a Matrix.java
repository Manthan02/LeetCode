class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        
        int l=indices.length;
        int[][] ans= new int[n][m];
        for(int i=0;i<l;i++)
        {
            for(int j=0;j<m;j++)
            {
                ans[indices[i][0]][j]++;
            }
            for(int j=0;j<n;j++)
            {
                ans[j][indices[i][1]]++;
            }
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(ans[i][j]%2==1)
                {
                    count++;
                }
            }
        }
        return count;
        
    }
}