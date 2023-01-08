class Solution {
    public int removeDuplicates(int[] nums) {
        int index=0;
        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
                index++;
            }
            else if(map.get(nums[i])<2)
            {
                map.put(nums[i], map.get(nums[i])+1);
                index++;
            }
            else
            {
                map.put(nums[i], map.get(nums[i])+1);
                nums[i]=nums[nums.length-1]+1;
            }
        }
        Arrays.sort(nums);
        return index;
    }
}
