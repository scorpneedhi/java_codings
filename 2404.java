class Solution {
    public int mostFrequentEven(int[] nums) {

        Map<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0){
                map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
            }
                
        }
        if(map.isEmpty())
            return -1;

        int ans = -1;
        int count=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet())
        {
            if(entry.getValue()>=count)
            {                
                
                count=entry.getValue();
                if(ans==-1)
                    ans = entry.getKey();
                else
                {
                    if(map.get(ans) == count)
                        ans = entry.getKey() < ans ? entry.getKey() : ans;
                    else
                        ans = entry.getKey();
                }
                    
            }
            
        }
        return ans;
    }
}
