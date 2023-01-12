class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> intMap = new HashMap<Integer,Integer>();
        for(Integer i:nums)
        {
            Integer count= intMap.get(i);
            if(count==null)
                count=0;
            intMap.put(i,++count);
            
        }
        List<Integer> intList = new ArrayList<Integer>();
        for(Map.Entry entry: intMap.entrySet())
        {
            if((int)entry.getValue()>nums.length/3)
            {
                intList.add((int)entry.getKey());
            }
        }
        return intList;
        /*
        return intMap.entrySet()
                        .stream()
                        .filter(e -> e.getValue() >  nums.length/3)
                        .map(e -> e.getKey())
                        .collect(Collectors.toList());*/
    }
}
