class Solution {
    public int stoneGameVIII(int[] stones) {
        int n=stones.length;
        int []p=stones.clone();
        for(int i=1;i<n;i++)
        {
            p[i]+=p[i-1];

        }
        int best=p[n-1];
        for(int i=n-2;i>=1;i--)
        {
            best=Math.max(best,p[i]-best);
        }
        return best;
    }

}