class Solution {
    public String fractionAddition(String expression) {
        String[] arr = expression.split("[+-]");
        Set<Integer> set = new HashSet<>();
        for(String item : arr){
            if(item.equals(""))
                continue;
            set.add(Integer.parseInt(item.split("/")[1]));
        }
        int b=1;
        for(Integer i : set)
            b*=i;
        int a=0;
        int start=0;
        for(String item: arr){
            if(item.equals(""))
                continue;
            boolean positive=false;
            int i= expression.indexOf(item,start);
            start+=item.length()+1;
            if(i==0 || expression.charAt(i-1)=='+')
                positive= true;
            int val= Integer.parseInt(item.split("/")[0]) * (b/Integer.parseInt(item.split("/")[1]));
            a+=(positive? 1 : -1)* val;
        }
        int g = gcd(Math.abs(a),b);
            a/=g;
            b/=g;
            return String.valueOf(a)+"/"+String.valueOf(b);
    }
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b,a%b);
    }
}