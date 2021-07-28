class Solution {
    public String longestWord(String[] words) {
        Set<String> set = new HashSet<>();
        String longestWord="";
        for(String word: words)
            set.add(word);
        for(String word: words){
            if(word.length()>longestWord.length() || word.length()==longestWord.length() 
              && word.compareTo(longestWord)<0){
                boolean check= true;
                for(int i=1;i<word.length();i++){
                    if(!set.contains((word.substring(0,i)))){
                    check= false;
                    break;
                } 
                }
                if(check)
                    longestWord= word;
                
            }
            
        }
        return longestWord;
    }
}