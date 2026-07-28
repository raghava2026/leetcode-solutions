class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sw=0;
        for(int i=0;i<k;i++)
        {
            sw+=nums[i];
        }
        double avg=sw/k;
        int j=0;
        for(int i=k;i<nums.length;i++)
        {
            sw-=nums[j];
            sw+=nums[i];
            if(sw/k >avg)
            {
                avg=sw/k;
            }
            j++;



        }
        return avg;
    }
}