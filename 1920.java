class Solution {
    public int[] buildArray(int[] nums) {
        int[] outnum = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            outnum[i] = nums[nums[i]];
        }
        return outnum;
    }
}
