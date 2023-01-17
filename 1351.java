class Solution {
    public int countNegatives(int[][] grid) {
        int count=0;
        for(int i=0; i<grid.length;i++)
        {
            int left=0;
            int right= grid[i].length - 1;
            if(grid[i][left] < 0)
                count = count + grid[i].length;
            else if (grid[i][right] >= 0)
                count += 0;
            else
                count = count + (grid[i].length - binarySearch(grid[i],left,right));
            System.out.println(count);
        }
        return count;
    }

    public int binarySearch(int[] nums, int left, int right)
    {
        if(right>=left)
        {
            int mid = left + (right - left)/2;

            if(nums[mid]<0 && nums[mid-1]>=0)
                return mid;
            else if(nums[mid]>=0)
                return binarySearch(nums,mid+1,right);
            else
                return binarySearch(nums,left,mid-1);
        }
        else
            return nums.length;
    }
}
