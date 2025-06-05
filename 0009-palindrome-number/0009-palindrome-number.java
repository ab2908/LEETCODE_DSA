class Solution {
    public boolean isPalindrome(int x) {
            if(x<0){
                return false;
            }

            int m = reverse(x);
            return m == x;
    }
    public int reverse(int y){
        int rev=0;
        while(y>0){
            int last= y%10;
            rev= rev*10 + last;
            y=y/10;
        }
        return rev;
    }
}