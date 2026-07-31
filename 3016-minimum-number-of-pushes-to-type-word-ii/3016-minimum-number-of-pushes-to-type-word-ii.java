class Solution {
    public int minimumPushes(String word) {
        int fq[]=new int[26];
        Set<Character> ch=new HashSet<>();
        for(char i:word.toCharArray())
        {
            fq[i-'a']++;
            ch.add(i);
        }
        int ans=0;
        int pos=0;
         Arrays.sort(fq);
        for(int i=25;i>=0;i--)
        {
            if(fq[i]==0)
            {
                break;
            }
            ans=ans+ fq[i]*((pos/8)+1);
            pos++;

        }
        return ans;
        
    }
}