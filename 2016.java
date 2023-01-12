class Solution {
    public int maximumDifference(int[] nums) {
        int ans = -1;
        int min = nums[0] ;
        for(int i=0; i<nums.length;i++)
        {
            ans=Math.max(ans,nums[i]-min);
            min=Math.min(nums[i],min);
        }
        if(ans==0)
            return -1;
        else
            return ans;
    }
}
