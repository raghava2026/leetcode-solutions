class Solution {
    public int maximumLengthSubstring(String s) {
        int left=0;
        int ans=0;
        int fq[]=new int[26];

        for(int r=0;r<s.length();r++)
        {
            char ch=s.charAt(r);
            fq[ch-'a']++;
            while(fq[ch-'a']>2)
            {
                fq[s.charAt(left)-'a']--;
                left++;
            }
            ans=Math.max(ans,r-left+1);
        }
        return ans;
    }
}