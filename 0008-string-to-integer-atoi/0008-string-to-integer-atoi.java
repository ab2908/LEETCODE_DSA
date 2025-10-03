class Solution {
    public int myAtoi(String s){
    int i = 0, sign = 1;
    long res = 0;
    while (i < s.length() && s.charAt(i) == ' ') i++;
    if (i == s.length()) return 0;
    if (s.charAt(i) == '-') {
        sign = -1;
        i++;
    } 
    else if (s.charAt(i) == '+') {
        i++;
    }
    while (i < s.length() && Character.isDigit(s.charAt(i))) {
        res = res * 10 + (s.charAt(i) - '0');
        if (sign * res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if (sign * res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        i++;
    }
    return (int)(sign * res);
    }
}