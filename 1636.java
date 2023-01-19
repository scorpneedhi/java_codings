class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> hmap= new HashMap<Integer,Integer>();
        for(int i=0; i<nums.length;i++)
        {
            hmap.put(nums[i],hmap.getOrDefault(nums[i],0)+1);
        }
        // Create a list from elements of HashMap
        List<Map.Entry<Integer, Integer> > list =
               new LinkedList<Map.Entry<Integer, Integer> >(hmap.entrySet());
 
        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer> >() {
            public int compare(Map.Entry<Integer, Integer> o1,
                               Map.Entry<Integer, Integer> o2)
            {
                if((o1.getValue()).equals(o2.getValue()))
                    return -(o1.getKey()).compareTo(o2.getKey());
                else
                    return (o1.getValue()).compareTo(o2.getValue());
            }
        });
        int i=0;
        for (Map.Entry<Integer, Integer> entry : list) {
            int val = entry.getValue();
            while(val != 0)
            {
                nums[i]=entry.getKey();
                i++;
                val--;
            }
        }

        return nums;
    }
}
