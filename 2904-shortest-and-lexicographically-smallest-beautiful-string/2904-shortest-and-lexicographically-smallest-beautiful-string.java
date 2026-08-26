class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        int left=0;
        int one=0;
        String ans="";
        for(int r=0;r<s.length();r++)
        {
            if(s.charAt(r)=='1')
            {
                one++;
            }

            if(one==k)
            {
                while(s.charAt(left)=='0')
                {
                    left++;
                }

                String curr=s.substring(left,r+1);
                if(ans=="")
                {
                    ans=curr;
                }
                else if(curr.length()<ans.length())
                {
                    ans=curr;
                }
                else if(curr.length()==ans.length() && curr.compareTo(ans)<0)
                {
                    ans=curr;
                }
                left++;
                one--;

            }
        }
        return ans;
    }
}