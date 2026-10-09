class Solution {
    public int minInsertions(String s) {
        int count=0;
        int ans=0;
        for(int ch:s.toCharArray())
        {
            if(ch=='(')
            {
                count+=2;
                 if (count % 2 != 0) {
                    ans++;
                    count--;
                }
            }
            else if(ch==')')
            {
                count--;
                if(count<0)
                {
                    ans+=1;
                    count=1;
                }
            }
        }
        return count+ans;

        
    }
}