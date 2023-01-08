class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0; i<s.length(); i++)
        {
            if (stack.isEmpty())
                stack.push(s.charAt(i));
            else if(s.charAt(i) != stack.peek())
                stack.push(s.charAt(i));
            else
                stack.pop();
            
        }
        String result ="";
        while (!stack.isEmpty())
        {
            result = stack.pop() + result;
        }
        return result ;
    }
}
