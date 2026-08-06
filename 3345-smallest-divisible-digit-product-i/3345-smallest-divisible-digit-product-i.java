class Solution {
    public int smallestNumber(int n, int t) {
       
       while(true)
       {
        if(isdiv(n,t))
        {
            return n;

        }
        n++;

       }
    }
    static Boolean isdiv(int n,int t)
    {
        int p=1;
        int x=n;
        while(x>0)
        {
            p*=(x%10);
            x/=10;

        }
        if(p%t==0)
        {
            return true;

        }
        return false;
    }
}