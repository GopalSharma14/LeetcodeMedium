class Solution {
    public int compress(char[] chars) {
        int count =1;
        int writeIndex=0;
        for(int i=0;i<chars.length;i++){
            if(i+1==chars.length || chars[i]!=chars[i+1]){
                chars[writeIndex++]=chars[i];
                if(count>1){
                    String str = String.valueOf(count);
                    for(int j=0;j<str.length();j++)
                        chars[writeIndex++]= str.charAt(j);
                }
                count=1;
            }else
                count++;
        }
        return writeIndex;
    }
}