class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<Character>();
        int j=0;
        for(int i=0; i<s.length();i++)
        {
            if(stk.isEmpty())
                stk.push(s.charAt(i));
            else
            {
                if(stk.peek()=='(' && s.charAt(i) ==')')
                    stk.pop();
                else if (stk.peek()=='[' && s.charAt(i) ==']')
                    stk.pop();
                else if(stk.peek()=='{' && s.charAt(i) =='}') 
                    stk.pop();
                else
                    stk.push(s.charAt(i));               
            
            }
        }
        return stk.isEmpty();
    }
}
