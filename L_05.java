class Solution {
    public String longestPalindrome(String s) {
        int start=0;
        int end=0;
        for(int i=0;i<s.length();i++){
            int len1= expandFromMiddle(s,i,i);
            int len2= expandFromMiddle(s,i,i+1);
            int len = Math.max(len1,len2);
            if(len>end-start){
                start= i-(len-1)/2;
                end= i +len/2;
            }
        }
        return s.substring(start,end+1);
    }
    public int expandFromMiddle(String s, int begin, int end){
        while(begin>=0 && end<s.length() && s.charAt(begin)==s.charAt(end)){
            begin--;
            end++;
        }
        return end-begin-1;
    }
}