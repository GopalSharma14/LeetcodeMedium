class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.equals(sentence2))
            return true;
        int l1 = sentence1.length();
        int l2 = sentence2.length();
        String long1 = l1>l2? sentence1:sentence2;
        String short1 = l1>l2? sentence2:sentence1;
        String[] arr1 = long1.split(" ",0);
        String[] arr2 = short1.split(" ",0);
        int i = 0, j = 0;
        int len1 = arr1.length, len2 = arr2.length;
        while (i < len1 && i < len2 && arr1[i].equals(arr2[i])) {
            i++;
        }
        
        while (len1 - 1 - j >= 0 && len2 - 1 - j >= 0
               && arr1[len1 - 1 - j].equals(arr2[len2 - 1 - j])) {
            j++;
        }
        
        //System.out.println(i + " " + j);
        if (i == 0 && j == 0) return false;
        if (i + j < arr2.length) return false;
        return true;
       
    }
}