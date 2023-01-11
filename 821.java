class Solution {
    public int[] shortestToChar(String s, char c) {
        int slen =s.length();
        int[] answer= new int[slen];
        Arrays.fill(answer,-1);
        int left = 0;
        int right = 0;
        for(int i=0;i<slen;i++)
        {
            if(s.charAt(i)==c)
            {
                answer[i]=0;
                left = i - 1;                
                right = i + 1;
                while(left>=0)
                {
                    if((answer[left]<0)||(answer[left]> Math.abs(i-left)))
                    {
                            answer[left]=Math.abs(i-left);
                            --left;
                        }                        
                        else
                            break;
                }
                while(right<=slen-1)
                {
                     if((answer[right]<0)||(answer[right]> Math.abs(i-right)))
                        {
                            answer[right]=Math.abs(i-right);
                            ++right;
                        }
                            
                        else
                            break;
                    
                }

            }
            
        }

        return answer;
    }
}
