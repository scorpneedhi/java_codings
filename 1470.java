class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ind=0;
        int[] ans=new int[nums.length];
        for(int i=0;i<n;i++)
        {
            ans[ind++] = nums[i];
            ans[ind++] = nums[i+n];
        }
        return ans;
    }
}
