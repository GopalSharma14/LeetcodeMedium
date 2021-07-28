class Solution {
    public int myAtoi(String s) {

        int i=0;
        int total =0;
        int sign=1;
        if(s.length()==0)
            return 0;
        while(i<s.length() && s.charAt(i)==' ') 
            i++;
        if (i == s.length()) return 0;
        if(s.charAt(i)=='+' || s.charAt(i)=='-'){
            sign = s.charAt(i)=='+'?1:-1;
            i++;
        }
        while(i < s.length()){
        int digit = s.charAt(i) - '0';
        if(digit < 0 || digit > 9) break;

        if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        total = 10 * total + digit;
        i++;
    }
    return total * sign;
}
}