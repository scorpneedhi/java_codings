class Solution {
    public String sortSentence(String s) {        
        String[] splitStr = s.split(" ");
        Map<Integer, String> sm = new TreeMap<Integer, String>();
            for(int i=0; i < splitStr.length; i++)
            {
                int ind = Integer.valueOf(splitStr[i].charAt(splitStr[i].length()-1));
                String word = splitStr[i].substring(0, splitStr[i].length()-1)+" ";
                sm.put(ind, word);
            }
            String sent = "";
            for(Map.Entry<Integer,String> m: sm.entrySet()){
                sent = sent + m.getValue();
            }
            return sent.trim();
    }
}
