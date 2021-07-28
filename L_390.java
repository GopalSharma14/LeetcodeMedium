class Solution {
    public int lastRemaining(int n) {
        boolean isLeft = true;
        int start = 1;
        int step = 1;
        while(n > 1){
            if(isLeft || n % 2 == 1){
                start = start + step;
            }
            n /= 2;
            step *= 2;
            isLeft = !isLeft;
        }
       return start;
    }
}