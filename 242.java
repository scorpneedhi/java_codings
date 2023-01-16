class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        HashMap<Character,Integer> smap= new HashMap<Character, Integer>();
        HashMap<Character,Integer> tmap= new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++)
        {
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
            tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);
        }
        
        if(tmap.size() != smap.size())
            return false;
            
        return smap.equals(tmap);
    }
}
