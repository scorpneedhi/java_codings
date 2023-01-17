class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        for(int i=0; i<numbers.length;i++)
        {
            if(!hmap.containsKey(target-numbers[i]))
                hmap.put(numbers[i],i+1);
            else
                return new int[]{hmap.get(target-numbers[i]),++i};

        }
        return new int[]{};
    }
}
