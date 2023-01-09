class Solution {
    public int removeElement(int[] nums, int val) {
        int index =0;
        Arrays.sort(nums);
        for(int i =0; i<nums.length; i++)
        {
            if(nums[i]==val)
                nums[i]=nums[nums.length-1]+1;
            else
                ++index;
        }
        Arrays.sort(nums);
        return index;

    }
}
