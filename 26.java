class Solution {
    public int removeDuplicates(int[] nums) {
      int index=0;
      for(int i =0; i<nums.length -1;i++)
      {
          if(nums[i] != nums[i+1]){                            
              index+=1;
              nums[index]=nums[i+1];
          }
      }
      return index+1;
    }
}