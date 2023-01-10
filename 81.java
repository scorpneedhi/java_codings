class Solution {
    public boolean search(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(left<=right)
        {
            if(target==nums[left])
                return true;
            else if (target==nums[right])
                return true;
            else{
                left++;
                right--;
            }
        }
        return false;
    }
}
