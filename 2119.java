class Solution {
    public boolean isSameAfterReversals(int num) {
        int temp=num;
        int reversed1=0;
        while(temp != 0)
        {
            reversed1 = (reversed1*10) + (temp%10);
            temp /= 10;
        }
        temp=0;
        while(reversed1 != 0)
        {
            temp = (temp*10) + (reversed1%10);
            reversed1 /= 10;
        }
        return temp==num;
    }
}
