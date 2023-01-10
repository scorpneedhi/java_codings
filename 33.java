class Solution {
    public int search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            if(target==nums[left])
                return left;
            else if (target==nums[right])
                return right;
            else{
                left++;
                right--;
            }
        }
        return -1;
    }
}
