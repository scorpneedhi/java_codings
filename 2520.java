class Solution {
    public int countDigits(int num) {
        int x= num;
        int ans = 0;
        if(x/10==0)
            return ++ans;
        while(x!=0)
        {
            if(num % (x%10) == 0)
                ans++;
            x /= 10;
        }
        return ans;
    }
}
