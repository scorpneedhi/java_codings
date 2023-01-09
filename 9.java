class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;

        int num = x;
        int result = 0;
        while(num != 0) {
            result = (result * 10) + (num % 10);
            num = num/ 10;
        }
        if(x == result)
            return true;
        else
            return false;
    }
}
