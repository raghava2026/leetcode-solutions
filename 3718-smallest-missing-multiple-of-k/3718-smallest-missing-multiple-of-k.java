class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums)
        {
            set.add(i);

        }
        int min=Integer.MAX_VALUE;
        for(int i=1;i<=nums.length+1;i++)
        {
            int val=k*i;
            if(!set.contains(val) && min>val)
            {
                min=val;
            }
        }
        return min;


    }
}