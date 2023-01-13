class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> tmap=new TreeMap<Integer,String>();
        for(int i=0;i<names.length;i++)
        {
            tmap.put(heights[i],names[i]);
        }
        int i = names.length-1;
        for (Map.Entry<Integer,String> ent:tmap.entrySet())
        {
            names[i--] = ent.getValue();
        }
        return names;
    }
}
