class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<n;i++)
        {
            int left=0;
            int right=image[i].length-1;
            while(left<=right)
            {
                int temp=image[i][left];
                image[i][left]=image[i][right]^1;
                image[i][right]=temp^1;
                left++;
                right--;
            }
        }
        return image;

        
    }
}