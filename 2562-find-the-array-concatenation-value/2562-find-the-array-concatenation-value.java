class Solution {
    public long findTheArrayConcVal(int[] nums) {
       long total=0;
       int l=0;
       int r=nums.length-1;
       
       while(l<r)
       {
        int a=count(nums[l],nums[r]);
        total+=a;
        l++;
        r--;
       } 
       if(nums.length%2!=0)
       {
        total+=nums[l];
       }
       return total;
    }
    static int count(int a,int b)
    {
        int ss=1;
        int aa=b;
        while(b>0)
        {
            ss*=10;
            b/=10;
        }
        return (a*ss)+aa;

    }
}