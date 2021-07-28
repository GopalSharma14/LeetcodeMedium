class Solution {
    public int numTeams(int[] rating) {
        int total=0;
        for(int i=1;i<rating.length;i++){
            int leftLess=0;
            int leftGreat=0;
            int rightLess=0;
            int rightGreat=0;
            for(int j=i-1;j>=0;j--){
                if(rating[i]>rating[j])
                    leftLess++;
                else
                    leftGreat++;
            }
            for(int k=i+1;k<rating.length;k++){
                if(rating[i]>rating[k])
                    rightLess++;
                else
                    rightGreat++;
            }
            total+=(rightLess*leftGreat)+(rightGreat*leftLess);
        }
        return total;
    }
}