class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        return binarSearch(nums,target,left,right);
    }
    public int binarSearch(int[] nums, int target, int left, int right)
    {
        if(right>=left)
        {
            int mid = (right - left)/2 + left;

            if(nums[mid]== target)
                return mid;
            else if(nums[mid]>target)
                return binarSearch(nums,target,left,mid-1);
            else
                return binarSearch(nums,target,mid+1,right);
        }
        return -1;
    }
}
