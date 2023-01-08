class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set= new HashSet<Integer>();
        for(int num:nums){
            if(set.contains(num))
                return num;
            set.add(num);
        }
        return 0;
    }
}