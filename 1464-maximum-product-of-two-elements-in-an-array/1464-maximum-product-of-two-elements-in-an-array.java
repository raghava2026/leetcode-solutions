class Solution {
    public int maxProduct(int[] nums) {
        
        // Arrays.sort(nums);
        // return (nums[nums.length-2]-1)* (nums[nums.length-1]-1);

        int max1=0;
        int max2=0;
        for(int i:nums)
        {
            if(max1<=i)
            {
                max2=max1;
                max1=i;
            }
            else if(max2<i)
            {
                max2=i;

            }
        }
        return (max1-1)*(max2-1);
    }
}