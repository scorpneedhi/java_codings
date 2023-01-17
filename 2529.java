class Solution {
    public int maximumCount(int[] nums) {
        int left=0;
        int right = nums.length - 1;
        if(nums[left] > 0 || nums[right] < 0)
            return nums.length;
        else if(nums[left] == 0 && nums[right] == 0)
            return 0;

        int pos = nums.length - binarySearchPos(nums, left, right);
        int neg = binarySearchNeg(nums, left, right) + 1;

        return Math.max(pos,neg);
    }

    public int binarySearchPos(int[] nums, int left, int right)
    {
        int mid = left + (right-left)/2;

        if(nums[mid-1] <=0 && nums[mid]>0)
            return mid;
        else if(nums[mid]>0)
            return binarySearchPos(nums,left,mid-1);
        else
            return binarySearchPos(nums,mid+1,right);     

    }

    public int binarySearchNeg(int[] nums, int left, int right)
    {
        int mid = left + (right-left)/2;
        if(nums[mid] <0 && nums[mid+1]>=0)
            return mid;
        else if(nums[mid]>=0)
            return binarySearchNeg(nums,left,mid-1);
        else
            return binarySearchNeg(nums,mid+1,right);
        

    }
}
