
class Solution {
    public int[] plusOne(int[] digits) {
        int sum=0;
        int rem=0;
        for(int i=digits.length -1; i>=0;i--)
        {
            sum = digits[i] + 1;
            digits[i]=sum%10;
            rem=sum/10;
            if(rem==0)
                return digits;
        }
        int[] ans=new int[digits.length+1];
        ans[0]=rem;
        System.arraycopy(digits,0,ans,1,digits.length);
        return ans;
    }
}
