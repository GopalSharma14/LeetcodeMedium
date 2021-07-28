class Solution {
    public String findLongestWord(String s, List<String> dictionary) {
        char[] word = s.toCharArray();
        List<String> list = new ArrayList<>();
        for(int i=0;i<dictionary.size();i++){
            char[] dictWord = dictionary.get(i).toCharArray();
            int left=0;
            int right=0;
            while(left<s.length()){
            if(word[left]==dictWord[right]){
                if(right==dictWord.length-1){
                    list.add(String.valueOf(dictWord));
                    break;
                }
                else{
                    left++;
                    right++;
                }                   
            }else
                left++;
        }
        }
        list.sort((a,b)-> a.length()==b.length()? a.compareTo(b) : b.length()-a.length());
        System.out.println(list);
        return list.get(0);     
    }
}