class Solution {
    public String smallestPalindrome(String s) {
        int frq[]=new int[26];
         for(char i:s.toCharArray())
         {
            frq[i-'a']++;
         }
         char ans[]=new char[s.length()];
         int l=0,r=s.length()-1;

         for(int i=0;i<26;i++)
         {
            while(frq[i]>=2)
            {
                ans[l++]=(char)(i+'a');
                ans[r--]=(char)(i+'a');
                frq[i]-=2;

            }
            if(frq[i]==1)
            {
                ans[s.length()/2]=(char)(i+'a');

            }
         }
         return new String(ans);
        
    }
}