class Solution {
    int count=0;
    public int countSubstrings(String s) {
        if(s.length() == 0)
            return 0;
        int n= s.length();
        for(int i=0;i<n;i++){
            countPalindromes(s,i,i);
            countPalindromes(s,i,i+1);
        }
        return count;
    }
    
    public void countPalindromes(String s,int begin, int end){
        while(begin>=0 && end<s.length() && s.charAt(begin)==s.charAt(end)){
            count++;
            begin--;
            end++;
        }
    }
}