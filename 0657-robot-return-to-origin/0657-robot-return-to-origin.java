class Solution {
    public boolean judgeCircle(String moves) {

        int uc=0,lc=0,rc=0,dc=0;
        for(char ch:moves.toCharArray())
        {
            if(ch=='U')
            {
                uc++;
            }
            else if(ch=='D')
            {
                dc++;
            }
            else if(ch=='R')
            {
                rc++;
            }
            else if(ch=='L')
            {
                lc++;
            }
        }
        if(uc==dc && lc==rc)
        {
            return true;
        }
        return false;
        
    }
}