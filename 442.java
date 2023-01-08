class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result= new ArrayList<Integer>();
        Set<Integer> mySet= new HashSet<Integer>();
        for(int num:nums)
        {
            if(mySet.contains(num))
                result.add(num);
            mySet.add(num);
        }
        return result;
    }
}