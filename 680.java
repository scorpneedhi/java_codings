class Solution {
    public boolean validPalindrome(String s) {
       int i=0;
       int j=s.length()-1;
       while(i<=j)
       {           
           if(s.charAt(i) != s.charAt(j))
           {
               return check(s, i+1, j) || check(s, i, j-1);
           }
           else
           {
               i++;
               j--;
           }
       }       
       return true;       
        
    }

    public boolean check(String s, int left, int right)
    {
        while(left<right)
        {
            if(s.charAt(left) != s.charAt(right))
                return false;
            else
            {
                left++;
                right--;
            }
        }
        return true;
    }
}
