class Solution {
    public String breakPalindrome(String palindrome) {
        if(palindrome.length()<=1)
            return "";
        char[] words = palindrome.toCharArray();
        for(int i=0;i<words.length;i++){
            if(words[i]!='a'){
                if(palindrome.length()%2!=0 && i==palindrome.length()/2)
                    continue;
                words[i]='a';
                break;
            }
            if(i==words.length-1)
                words[i]='b';
        }
        return String.valueOf(words);
        
    }
}