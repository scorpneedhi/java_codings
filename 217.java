class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int v : nums) {
            set.add(v);
            }
            if(nums.length == set.size()){
                return false;
            }
            return true;
    }
}
