class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] longarr = nums1.length > nums2.length ? nums1 : nums2;
        HashSet<Integer> set1 = new HashSet<>();
        int[] outnum = new int[nums1.length < nums2.length ? nums1.length : nums2.length];
        int ind=0;
        for(Integer i:nums1)
        {
            set1.add(i);
        }
        for(Integer i:nums2)
        {
            if(set1.remove(i))
            {
                outnum[ind] = i;
                ind++;
            }                
        }
        return Arrays.copyOfRange(outnum,0,ind);
    }
}
