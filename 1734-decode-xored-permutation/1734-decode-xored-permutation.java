class Solution {
    public int[] decode(int[] encoded) {
        int total=0;
        int n=encoded.length+1;
        for(int i=1;i<=n;i++)
        {
            total^=i;

        }
        for(int i=1;i<encoded.length;i+=2)
        {
            total^=encoded[i];
        }
     
          int[] perm = new int[n];

        perm[0] = total;

        for (int i = 0; i < encoded.length; i++) {
            perm[i + 1] = encoded[i] ^ perm[i];
        }

        return perm;
        
    }
}