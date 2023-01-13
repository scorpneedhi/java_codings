class Solution {
    public String firstPalindrome(String[] words) {
        for(int i=0; i<words.length; i++)
        {
            int j=0;
            String word=words[i];
            int k=word.length()-1;
            boolean flag = true;
            while(j<k)
            {
                if(word.charAt(j) != word.charAt(k))
                {
                    flag = false;
                    break;
                }
                j++;
                k--;
            }
            if(flag)
                return word;
        }
        return "";
    }
}
